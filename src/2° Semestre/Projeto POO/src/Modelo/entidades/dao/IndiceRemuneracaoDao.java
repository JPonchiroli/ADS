package Modelo.entidades.dao;

import Modelo.entidades.IndiceRemuneracao;

import java.util.List;

public interface IndiceRemuneracaoDao {
    void inserir(IndiceRemuneracao indRemu);

    IndiceRemuneracao buscaPorCodigo(Long codigo);

    List<IndiceRemuneracao> buscarTodos();
}
