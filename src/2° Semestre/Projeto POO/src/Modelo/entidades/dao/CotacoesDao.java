package Modelo.entidades.dao;

import Modelo.entidades.Cotacoes;

import java.util.List;

public interface CotacoesDao {
    void inserir(Cotacoes cot);
    Cotacoes buscarPorCodido(Long codigo);
    List<Cotacoes> buscarTodos();
}
