package Modelo.entidades.dao;

import Modelo.entidades.Localidade;

import java.util.List;

public interface LocalidadeDao {
    void inserir(Localidade loc);
    Localidade buscarPorCEP(Long CEP);
    List<Localidade> buscarTodos();

}
