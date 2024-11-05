package Modelo.Entidades.Dao;

import Modelo.Entidades.PessoaFisica;

import java.util.List;

public interface PessoaFisicaDao {
    void inserir();
    PessoaFisica buscarPorCPF(Long CPF);
    List<PessoaFisica> buscarTodos();

}
