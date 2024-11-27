package Modelo.entidades.dao;

import Modelo.entidades.ContaPoupanca;

import java.util.List;

public interface ContaPoupancaDao {
    void inserir(ContaPoupanca cp);
    ContaPoupanca buscaPorId(Long id);
    List<ContaPoupanca> buscarTodos();
}
