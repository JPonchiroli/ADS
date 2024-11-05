package Modelo.Entidades.Dao;

import Modelo.Entidades.Pessoa;

import java.util.List;

public interface PessoaDao {
    void inserir();
    void desabilitar();
    Pessoa buscarPorId(Long Id);
    List<Pessoa> buscarTodos();
    void adicionarFone(Long Id);
    void removerFone(Long Id);
}
