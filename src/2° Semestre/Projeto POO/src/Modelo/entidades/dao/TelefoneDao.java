package Modelo.entidades.dao;

import Modelo.entidades.Telefone;

import java.util.List;

public interface TelefoneDao {
    void inserir(Telefone tel);
    List<Telefone> listaFones();
}
