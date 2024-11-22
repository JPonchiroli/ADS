package Modelo.entidades.dao.impl;

import Modelo.entidades.Pessoa;
import Modelo.entidades.PessoaFisica;
import Modelo.entidades.Telefone;
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
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * " +
                            "FROM pessoafisica " +
                            "WHERE cpf = ? ");

            st.setLong(1, CPF);
            rs = st.executeQuery();
            if (rs.next()){
                PessoaFisica pf = instanciarPessoaFisica(rs);
                return pf;
            }
            return null;

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<PessoaFisica> buscarTodos() {
        return null;
    }

    private PessoaFisica instanciarPessoaFisica(ResultSet rs) throws SQLException {
        PessoaFisica pf = new PessoaFisica();
        pf.setCPF(rs.getLong("cpf"));
        pf.setNome(rs.getString("nome"));
        pf.setdtNasc(rs.getDate("dtNasc"));
        pf.setSexo(rs.getString("sexo"));
        return pf;
    }
}
