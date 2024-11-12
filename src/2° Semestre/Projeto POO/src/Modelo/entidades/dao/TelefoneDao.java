package Modelo.entidades.dao;

import Modelo.entidades.Telefone;

import java.util.List;

public interface TelefoneDao {
    void inserir();
    List<Telefone> listaFones();
}
