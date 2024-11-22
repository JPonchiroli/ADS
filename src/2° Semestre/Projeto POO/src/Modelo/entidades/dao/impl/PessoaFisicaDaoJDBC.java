package Modelo.entidades.dao.impl;

import Modelo.entidades.PessoaFisica;
import Modelo.entidades.dao.PessoaFisicaDao;

import java.sql.*;
import java.util.List;

public class PessoaFisicaDaoJDBC implements PessoaFisicaDao {

    private Connection conn;

    public PessoaFisicaDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void inserir(PessoaFisica pf) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO pessoafisica " +
                            "VALUES " +
                            "(?, ?, ?, ?) ");

            st.setLong(1, pf.getCPF());
            st.setString(2, pf.getNome());
            st.setDate(3, new java.sql.Date(pf.getdtNasc().getTime()));
            st.setString(4, pf.getSexo());

            st.executeUpdate();

            System.out.println("Pessoa Fisica criada com Sucesso");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public PessoaFisica buscarPorCPF(Long CPF) {
        return null;
    }

    @Override
    public List<PessoaFisica> buscarTodos() {
        return null;
    }
}
