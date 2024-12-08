package Modelo.entidades.dao.impl;

import Modelo.entidades.Banco;
import Modelo.entidades.ContaCorrente;
import Modelo.entidades.dao.ContaCorrenteDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrenteDaoJDBC implements ContaCorrenteDao {

    private Connection conn;

    public ContaCorrenteDaoJDBC(Connection conn){
        this.conn = conn;
    }

    public void inserir(ContaCorrente cs) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO conta_corrente " +
                            "(codigo_banco, agencia, numero, saldo, data_abertura, titular, valoresCestaServicos, limitePixNoturno) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

            st.setLong(1, cs.getBanco().getCodigo());
            st.setInt(2, cs.getAgencia());
            st.setLong(3, cs.getNumero());
            st.setDouble(4, cs.getSaldo());
            st.setDate(5, new java.sql.Date(cs.getDataAbertura().getTime()));
            st.setString(6, cs.getTitular());
            st.setDouble(7, cs.getValorcestaservicos());
            st.setDouble(8, cs.getLimitepixnoturno());

            st.executeUpdate();

            System.out.println("Conta Corrente inserida com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ContaCorrente buscarPorId(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * " +
                            "FROM conta_corrente " +
                            "WHERE id = ?");

            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                return instanciarContaCorrente(rs);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ContaCorrente> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT * FROM conta_corrente");

            rs = st.executeQuery();

            List<ContaCorrente> list = new ArrayList<>();
            while (rs.next()) {
                list.add(instanciarContaCorrente(rs));
            }

            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private ContaCorrente instanciarContaCorrente(ResultSet rs) throws SQLException {
        ContaCorrente cc = new ContaCorrente();
        cc.setId(rs.getInt("id"));

        Banco banco = new Banco();
        banco.setCodigo(rs.getLong("codigo_banco"));
        cc.setBanco(banco);

        cc.setAgencia(rs.getInt("agencia"));
        cc.setNumero(rs.getLong("numero"));
        cc.setSaldo(rs.getDouble("saldo"));
        cc.setdataAbertura(rs.getDate("data_abertura"));
        cc.setTitular(rs.getString("titular"));

        cc.setValorcestaservicos(rs.getDouble("valoresCestaServicos"));
        cc.setLimitepixnoturno(rs.getDouble("limitePixNoturno"));
        return cc;
    }
}

