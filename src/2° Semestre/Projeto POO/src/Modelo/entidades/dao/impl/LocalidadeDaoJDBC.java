package Modelo.entidades.dao.impl;

import Modelo.entidades.Localidade;
import Modelo.entidades.dao.LocalidadeDao;

import java.sql.*;
import java.util.*;

public class LocalidadeDaoJDBC implements LocalidadeDao {

    private Connection conn;

    public LocalidadeDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void inserir(Localidade loc) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO localidade " +
                            "VALUES " +
                            "(?, ?, ?, ?, ?) ");

            st.setLong(1, loc.getCEP());
            st.setString(2, loc.getEstado());
            st.setString(3, loc.getCidade());
            st.setString(4, loc.getBairro());
            st.setString(5, loc.getLogradouro());

            st.executeUpdate();
            System.out.println("Localidade criada com Sucesso");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Localidade buscarPorCEP(Long CEP) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * FROM localidade" +
                            "WHERE cep == ?");

            st.setLong(1, CEP);

            rs = st.executeQuery();
            if (rs.next()){
                Localidade loc = instanciarLocalidade(rs);
                return loc;
            }
            return null;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Localidade> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * FROM localidade");

            rs = st.executeQuery();

            List<Localidade> list = new ArrayList<>();
            Map<Long, Localidade> map = new HashMap<>();

            while (rs.next()) {

                Localidade loc = map.get(rs.getLong("cep"));

                if (loc == null) {
                    loc = instanciarLocalidade(rs);
                    map.put(rs.getLong("cep"), loc);
                }

                list.add(loc);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    private Localidade instanciarLocalidade(ResultSet rs) throws SQLException {
        Localidade loc = new Localidade();
        loc.setCEP(rs.getLong("cep"));
        loc.setCidade(rs.getString("cidade"));
        loc.setBairro(rs.getString("bairro"));
        loc.setLogradouro(rs.getString("logradouro"));
        return loc;
    }

}
