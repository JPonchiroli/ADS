package Modelo.entidades.dao.impl;

import Modelo.entidades.ContaCorrente;
import Modelo.entidades.ContaSalario;
import Modelo.entidades.dao.ContaCorrenteDao;
import Modelo.entidades.dao.ContaSalarioDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContaSalarioDaoJDBC implements ContaSalarioDao {

    private Connection conn;

    public ContaSalarioDaoJDBC(Connection conn){
        this.conn = conn;
    }

    public void inserir(ContaSalario cs) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(
                    "INSERT INTO conta_salario " +
                            "(cnpj_vinculado, limite_consignado, limite_antecipacao_mes, permite_antecipar_13o, conta_vinculada) " +
                            "VALUES (?, ?, ?, ?, ?)");

            st.setString(1, cs.getCnpjVinculado());
            st.setDouble(2, cs.getLimiteConsignado());
            st.setDouble(3, cs.getLimiteAntecipacaoMes());
            st.setBoolean(4, cs.isPermiteAntecipar13o());
            st.setLong(5, cs.getContaVinculada());

            st.executeUpdate();

            System.out.println("Conta salário inserida com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ContaSalario buscaPorId(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * FROM conta_salario " +
                            "WHERE id = ?");

            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                return instanciarContaSalario(rs);
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<ContaSalario> buscarTodos() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * " +
                            "FROM conta_salario ");

            rs = st.executeQuery();

            List<ContaSalario> lista = new ArrayList<>();
            while (rs.next()) {
                lista.add(instanciarContaSalario(rs));
            }

            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private ContaSalario instanciarContaSalario(ResultSet rs) throws SQLException {
        ContaSalario contaSalario = new ContaSalario();
        contaSalario.setId(rs.getInt("id"));
        contaSalario.setCnpjvinculado(rs.getString("cnpj_vinculado"));
        contaSalario.setLimiteconsignado(rs.getDouble("limite_consignado"));
        contaSalario.setLimiteantecipacaomes(rs.getDouble("limite_antecipacao_mes"));
        contaSalario.setPermiteantecipar13o(rs.getBoolean("permite_antecipar_13o"));
        contaSalario.setContaVinculada(rs.getLong("conta_vinculada"));
        return contaSalario;
    }
}
