package Modelo.entidades.dao.impl;

import Modelo.entidades.Banco;
import Modelo.entidades.ContaPoupanca;
import Modelo.entidades.IndiceRemuneracao;
import Modelo.entidades.dao.ContaPoupancaDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaPoupancaDaoJDBC implements ContaPoupancaDao {

    private Connection conn;

    public ContaPoupancaDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void inserir(ContaPoupanca cp) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO conta_poupanca " +
                            "(codigo_banco, agencia, numero, saldo, data_abertura, titular, indice_remuneracao_id, aniversario, perc_rendimento_real) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?) ");

            st.setLong(1, cp.getBanco().getCodigo());
            st.setInt(2, cp.getAgencia());
            st.setLong(3, cp.getNumero());
            st.setDouble(4, cp.getSaldo());
            st.setDate(5, new java.sql.Date(cp.getdataAbertura().getTime()));
            st.setString(6, cp.getTitular());
            st.setLong(7, cp.getIndiceRemuneracao().getCodigo());
            st.setDate(8, new java.sql.Date(cp.getdiaAniversario().getTime()));
            st.setDouble(9, cp.getpercRendimentoReal());

            st.executeUpdate();

            System.out.println("Conta Poupança inserida com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ContaPoupanca buscaPorId(Long id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * " +
                            "FROM conta_poupanca " +
                            "WHERE id = ?");

            st.setLong(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                return instanciarContaPoupanca(rs);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ContaPoupanca> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * FROM conta_poupanca");

            rs = st.executeQuery();

            List<ContaPoupanca> list = new ArrayList<>();
            while (rs.next()) {
                list.add(instanciarContaPoupanca(rs));
            }

            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private ContaPoupanca instanciarContaPoupanca(ResultSet rs) throws SQLException {
        ContaPoupanca cp = new ContaPoupanca();
        cp.setId(rs.getLong("id"));

        Banco banco = new Banco();
        banco.setCodigo(rs.getLong("codigo_banco"));
        cp.setBanco(banco);

        cp.setAgencia(rs.getInt("agencia"));
        cp.setNumero(rs.getLong("numero"));
        cp.setSaldo(rs.getDouble("saldo"));
        cp.setdataAbertura(rs.getDate("data_abertura"));
        cp.setTitular(rs.getString("titular"));

        IndiceRemuneracao ir = new IndiceRemuneracao();
        ir.setCodigo(rs.getLong("indice_remuneracao_id"));
        cp.setIndiceRemuneracao(ir);

        cp.setdiaAniversario(rs.getDate("aniversario"));
        cp.setpercRendimentoReal(rs.getDouble("perc_rendimento_real"));

        return cp;
    }
}
