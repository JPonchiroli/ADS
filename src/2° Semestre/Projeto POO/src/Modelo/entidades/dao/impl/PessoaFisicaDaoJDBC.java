package Modelo.entidades.dao.impl;

import Modelo.entidades.PessoaFisica;
import Modelo.entidades.dao.PessoaFisicaDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class PessoaFisicaDaoJDBC implements PessoaFisicaDao {

    private Connection conn;

    public PessoaFisicaDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void inserir() {
        PreparedStatement st = null;


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
