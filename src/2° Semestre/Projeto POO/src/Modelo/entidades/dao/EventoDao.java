package Modelo.entidades.dao;

import Modelo.entidades.Evento;

import java.util.List;

public interface EventoDao {
    void inserir(Evento ev);
    Evento buscarPorId(Long id);
    List<Evento> buscarTodos();
}
