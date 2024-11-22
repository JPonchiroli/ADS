package Modelo.entidades.dao.impl;

import Modelo.entidades.Localidade;
import Modelo.entidades.Telefone;
import Modelo.entidades.dao.TelefoneDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefoneDaoJDBC implements TelefoneDao {

    private Connection conn;

    public TelefoneDaoJDBC(Connection conn) {
        this.conn = conn;

    }

    @Override
    public void inserir(Telefone tel) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO telefone " +
                            "(numero, tipo)" +
                            "VALUES " +
                            "(?, ?) ");

            st.setLong(1, tel.getNumeroTelefone());
            st.setString(2, tel.getTipoTelefone());

            st.executeUpdate();
            System.out.println("Telefone criada com Sucesso");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Telefone> listaFones() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * FROM telefone");

            rs = st.executeQuery();

            List<Telefone> list = new ArrayList<>();
            Map<Integer, Telefone> map = new HashMap<>();

            while (rs.next()) {

                Telefone tel = map.get(rs.getInt("id"));

                if (tel == null) {
                    tel = instanciarTelefone(rs);
                    map.put(rs.getInt("id"), tel);
                }

                list.add(tel);
            }
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Telefone instanciarTelefone(ResultSet rs) throws SQLException {
        Telefone tel = new Telefone();
        tel.setId((long) rs.getInt("id"));
        tel.setNumeroTelefone(rs.getLong("numero"));
        tel.setTipoTelefone(rs.getString("tipo"));
        return tel;
    }
}
