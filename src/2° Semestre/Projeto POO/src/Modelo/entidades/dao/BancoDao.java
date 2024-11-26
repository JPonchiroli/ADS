package Modelo.entidades.dao;

import Modelo.entidades.Banco;

import java.util.List;

public interface BancoDao {
    void inserir(Banco bc);
    Banco buscarPorCodigo(Long codigo);
    List<Banco> buscarTodos();
}
