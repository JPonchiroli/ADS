package Modelo.entidades.dao.impl;

import Modelo.entidades.Cotacoes;
import Modelo.entidades.dao.CotacoesDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CotacoesDaoJDBC implements CotacoesDao {

    private Connection conn;

    public CotacoesDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(Cotacoes cot) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO cotacoes " +
                            "(codigo, data, valor) " +
                            "VALUES (?, ?, ?)");

            st.setLong(1, cot.getCodigo());
            st.setDate(2, new java.sql.Date(cot.getData().getTime()));
            st.setDouble(3, cot.getValor());

            st.executeUpdate();

            System.out.println("Cotação inserida com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            fecharStatement(st);
        }
    }

    @Override
    public Cotacoes buscarPorCodido(Long codigo) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * FROM cotacoes WHERE codigo = ?");

            st.setLong(1, codigo);
            rs = st.executeQuery();

            if (rs.next()) {
                return instanciarCotacao(rs);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            fecharResultSet(rs);
            fecharStatement(st);
        }
    }

    @Override
    public List<Cotacoes> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT * FROM cotacoes");

            rs = st.executeQuery();

            List<Cotacoes> list = new ArrayList<>();
            while (rs.next()) {
                list.add(instanciarCotacao(rs));
            }

            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            fecharResultSet(rs);
            fecharStatement(st);
        }
    }

    private Cotacoes instanciarCotacao(ResultSet rs) throws SQLException {
        Cotacoes cot = new Cotacoes();
        cot.setCodigo(rs.getLong("codigo"));
        cot.setData(rs.getDate("data"));
        cot.setValor(rs.getDouble("valor"));
        return cot;
    }

    private void fecharStatement(PreparedStatement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void fecharResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
