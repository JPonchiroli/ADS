package Modelo.entidades.dao.impl;

import Modelo.entidades.PessoaFisica;
import Modelo.entidades.PessoaJuridica;
import Modelo.entidades.dao.PessoaFisicaDao;
import Modelo.entidades.dao.PessoaJuridicaDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PessoaJuridicaDaoJDBC implements PessoaJuridicaDao {

    private Connection conn;

    public PessoaJuridicaDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void inserir(PessoaJuridica pj) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO pessoajuridica " +
                            "VALUES " +
                            "(?, ?, ?, ?) ");

            st.setString(1, pj.getCNPJ());
            st.setString(2, pj.getRazaoSocial());
            st.setString(3, pj.getInscrEstadual());
            st.setString(4, pj.getnomeFantasia());

            st.executeUpdate();

            System.out.println("Pessoa Juridica criada com Sucesso");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public PessoaJuridica buscarPorCNPJ(String CNPJ) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * " +
                            "FROM pessoajuridica " +
                            "WHERE cnpj = ? ");

            st.setString(1, CNPJ);
            rs = st.executeQuery();
            if (rs.next()){
                PessoaJuridica pj = instanciarPessoaJuridica(rs);
                return pj;
            }
            return null;

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public List<PessoaJuridica> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * FROM pessoajuridica");

            rs = st.executeQuery();

            List<PessoaJuridica> list = new ArrayList<>();
            Map<String, PessoaJuridica> map = new HashMap<>();

            while (rs.next()) {

                PessoaJuridica pj = map.get(rs.getLong("cnpj"));

                if (pj == null) {
                    pj = instanciarPessoaJuridica(rs);
                    map.put(rs.getString("cnpj"), pj);
                }

                list.add(pj);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private PessoaJuridica instanciarPessoaJuridica(ResultSet rs) throws SQLException {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setCNPJ(rs.getString("cnpj"));
        pj.setRazaoSocial(rs.getString("razaoSocial"));
        pj.setInscrEstadual(rs.getString("inscEstadual"));
        pj.setnomeFantasia(rs.getString("nomeFantasia"));
        return pj;
    }
}
