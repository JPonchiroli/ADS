package Modelo.Entidades.Dao;

import Modelo.Entidades.Localidade;

import java.util.List;

public interface LocalidadeDao {
    void inserir();
    Localidade buscarPorCEP(Long CEP);
    List<Localidade> buscarTodos();

}
