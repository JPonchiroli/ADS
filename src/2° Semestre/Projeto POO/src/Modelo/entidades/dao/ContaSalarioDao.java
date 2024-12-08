package Modelo.entidades.dao;

import Modelo.entidades.ContaSalario;

import java.util.List;

public interface ContaSalarioDao {
    void inserir(ContaSalario contaSalario);
    ContaSalario buscaPorId(int id);
    List<ContaSalario> buscarTodos();
}
