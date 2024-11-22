package aplicacao;

import Modelo.entidades.Localidade;
import Modelo.entidades.Telefone;
import Modelo.entidades.dao.DaoFactory;
import Modelo.entidades.dao.LocalidadeDao;
import Modelo.entidades.dao.TelefoneDao;
import Modelo.entidades.dao.impl.LocalidadeDaoJDBC;
import db.DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        // Localidade
        /*
        LocalidadeDao localidadeDao = DaoFactory.createLocalidadeDao();
        Localidade localidade = new Localidade(89041001l, "Santa Catarina", "Blumenau", "Velha", "Rua General Osório");
        localidadeDao.inserir(localidade);
        */
        //--------------------------------------------------------------------------------------------------------------
        // Telefone
        /*
        TelefoneDao telefoneDao = DaoFactory.createTelefoneDao();
        Telefone telefone = new Telefone(47996854628l, "Telefone Casa");
        telefoneDao.inserir(telefone);
        */
        //--------------------------------------------------------------------------------------------------------------
        // Telefone


    }
}
