package Modelo.entidades.dao;

import Modelo.entidades.ContaEspecial;

import java.util.List;

public interface ContaEspecialDao {
    void inserir(ContaEspecial contaEspecial);
    ContaEspecial buscaPorId(int id);
    List<ContaEspecial> buscarTodos();
}
