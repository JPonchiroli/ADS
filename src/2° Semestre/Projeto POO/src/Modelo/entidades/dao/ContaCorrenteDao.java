package Modelo.entidades.dao;

import Modelo.entidades.ContaCorrente;

import java.util.List;

public interface ContaCorrenteDao {
    void inserir(ContaCorrente contaCorrente);
    ContaCorrente buscarPorId(Integer id);
    List<ContaCorrente> buscarTodos();
}
