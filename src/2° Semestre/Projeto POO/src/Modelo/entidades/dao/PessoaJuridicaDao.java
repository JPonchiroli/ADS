package Modelo.entidades.dao;

import Modelo.entidades.PessoaJuridica;

import java.util.List;

public interface PessoaJuridicaDao {
    void inserir();
    PessoaJuridica buscarPorCNPJ(Long CNPJ);
    List<PessoaJuridica> buscarTodos();
}
