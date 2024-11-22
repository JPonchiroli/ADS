package Modelo.entidades.dao;

import Modelo.entidades.PessoaFisica;

import java.util.List;

public interface PessoaFisicaDao {
    void inserir(PessoaFisica pf);
    PessoaFisica buscarPorCPF(Long CPF);
    List<PessoaFisica> buscarTodos();

}
