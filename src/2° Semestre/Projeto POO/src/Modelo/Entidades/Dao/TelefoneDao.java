package Modelo.Entidades.Dao;

import Modelo.Entidades.Telefone;

import java.util.List;

public interface TelefoneDao {
    void inserir();
    List<Telefone> listaFones();
}
