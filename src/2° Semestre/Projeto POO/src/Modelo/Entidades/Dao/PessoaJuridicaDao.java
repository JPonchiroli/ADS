package Modelo.Entidades.Dao;

import Modelo.Entidades.PessoaJuridica;

import java.util.List;

public interface PessoaJuridicaDao {
    void inserir();
    PessoaJuridica buscarPorCNPJ(Long CNPJ);
    List<PessoaJuridica> buscarTodos();
}
