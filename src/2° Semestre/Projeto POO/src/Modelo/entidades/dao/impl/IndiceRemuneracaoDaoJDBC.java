package Modelo.entidades.dao.impl;

import Modelo.entidades.IndiceRemuneracao;
import Modelo.entidades.dao.IndiceRemuneracaoDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class IndiceRemuneracaoDaoJDBC implements IndiceRemuneracaoDao {

    private Connection conn;

    public IndiceRemuneracaoDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void inserir(IndiceRemuneracao indRemu) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO indiceRemuneracao " +
                            "(codigo, descricao, periodicidade, situacao) " +
                            "VALUES (?, ?, ?, ?)");

            st.setLong(1, indRemu.getCodigo());
            st.setString(2, indRemu.getDescricao());
            st.setString(3, indRemu.getPeriodicidade());
            st.setString(4, indRemu.getSituacao());

            st.executeUpdate();

            System.out.println("Índice de Remuneração inserido com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public IndiceRemuneracao buscaPorCodigo(Long codigo) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * FROM indiceRemuneracao WHERE codigo = ?");

            st.setLong(1, codigo);
            rs = st.executeQuery();

            if (rs.next()) {
                return instanciarIndiceRemuneracao(rs);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<IndiceRemuneracao> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement("SELECT * FROM indiceRemuneracao");

            rs = st.executeQuery();

            List<IndiceRemuneracao> list = new ArrayList<>();
            while (rs.next()) {
                list.add(instanciarIndiceRemuneracao(rs));
            }

            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private IndiceRemuneracao instanciarIndiceRemuneracao(ResultSet rs) throws SQLException {
        IndiceRemuneracao indRemu = new IndiceRemuneracao();
        indRemu.setCodigo(rs.getLong("codigo"));
        indRemu.setDescricao(rs.getString("descricao"));
        indRemu.setPeriodicidade(rs.getString("periodicidade"));
        indRemu.setSituacao(rs.getString("situacao"));
        return indRemu;
    }

}
