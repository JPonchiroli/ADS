package Modelo.entidades.dao.impl;

import Modelo.entidades.Banco;
import Modelo.entidades.dao.BancoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BancoDaoJDBC implements BancoDao {

    private Connection conn;

    public BancoDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void inserir(Banco bc) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO banco " +
                            "VALUES " +
                            "(?, ?, ?, ?)");

            st.setLong(1, bc.getCodigo());
            st.setString(2, bc.getNome());
            st.setString(3, bc.getmascaraAgencia());
            st.setString(4, bc.getmascaraConta());

            st.executeUpdate();

            System.out.println("Banco inserido com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Banco buscarPorCodigo(Long codigo) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * " +
                            "FROM banco " +
                            "WHERE codigo = ?");

            st.setLong(1, codigo);
            rs = st.executeQuery();

            if (rs.next()) {
                return instanciarBanco(rs);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Banco> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT * FROM banco");

            rs = st.executeQuery();

            List<Banco> list = new ArrayList<>();
            while (rs.next()) {
                list.add(instanciarBanco(rs));
            }

            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Banco instanciarBanco(ResultSet rs) throws SQLException {
        Banco banco = new Banco();
        banco.setCodigo(rs.getLong("codigo"));
        banco.setNome(rs.getString("nome"));
        banco.setmascaraAgencia(rs.getString("mascaraagencia"));
        banco.setmascaraConta(rs.getString("mascaraconta"));
        return banco;
    }
}
