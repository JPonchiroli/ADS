package Modelo.entidades.dao;

import Modelo.entidades.PessoaJuridica;

import java.util.List;

public interface PessoaJuridicaDao {
    void inserir(PessoaJuridica pj);
    PessoaJuridica buscarPorCNPJ(String CNPJ);
    List<PessoaJuridica> buscarTodos();
}
