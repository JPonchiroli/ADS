package Modelo.entidades.dao.impl;

import Modelo.entidades.ContaEspecial;
import Modelo.entidades.dao.ContaCorrenteDao;
import Modelo.entidades.dao.ContaEspecialDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaEspecialDaoJDBC implements ContaEspecialDao {

    private Connection conn;

    public ContaEspecialDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    public void inserir(ContaEspecial ce) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO conta_especial (limite_credito, data_vcto_contrato) " +
                            "VALUES (?, ?)");

            st.setDouble(1, ce.getLimiteCredito());
            st.setDate(2, new java.sql.Date(ce.getDataVctoContrato().getTime()));

            st.executeUpdate();

            System.out.println("Conta especial inserida com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ContaEspecial buscaPorId(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * " +
                            "FROM conta_especial " +
                            "WHERE id = ? ");

            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                return instanciarContaEspecial(rs);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ContaEspecial> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * FROM conta_especial ");

            rs = st.executeQuery();

            List<ContaEspecial> lista = new ArrayList<>();
            while (rs.next()) {
                lista.add(instanciarContaEspecial(rs));
            }

            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private ContaEspecial instanciarContaEspecial(ResultSet rs) throws SQLException {
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setLimiteCredito(rs.getDouble("limite_credito"));
        contaEspecial.setDataVctoContrato(rs.getDate("data_vcto_contrato"));
        return contaEspecial;
    }
}
