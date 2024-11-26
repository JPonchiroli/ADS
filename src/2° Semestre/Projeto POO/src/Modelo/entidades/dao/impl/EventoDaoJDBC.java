package Modelo.entidades.dao.impl;

import Modelo.entidades.Evento;
import Modelo.entidades.dao.EventoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EventoDaoJDBC implements EventoDao {

    private Connection conn;

    public EventoDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void inserir(Evento ev) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO evento " +
                            "VALUES " +
                            "(?, ?, ?, ?)");

            st.setLong(1, ev.getId());
            st.setString(2, ev.getDescricao());
            st.setString(3, ev.getTipoMovimentacao());
            st.setString(4, ev.getSituacao());

            st.executeUpdate();

            System.out.println("Evento inserido com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Evento buscarPorId(Long id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * " +
                            "FROM evento " +
                            "WHERE id = ?");

            st.setLong(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                return instanciarEvento(rs);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Evento> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT * FROM evento");

            rs = st.executeQuery();

            List<Evento> list = new ArrayList<>();
            while (rs.next()) {
                list.add(instanciarEvento(rs));
            }

            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Evento instanciarEvento(ResultSet rs) throws SQLException {
        Evento evento = new Evento();
        evento.setId(rs.getLong("id"));
        evento.setDescricao(rs.getString("descricao"));
        evento.setTipoMovimentacao(rs.getString("tipoMovimentacao"));
        evento.setSituacao(rs.getString("situacao"));
        return evento;
    }

}
