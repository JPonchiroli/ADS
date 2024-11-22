package Modelo.entidades.dao;

import Modelo.entidades.dao.impl.LocalidadeDaoJDBC;
import Modelo.entidades.dao.impl.PessoaFisicaDaoJDBC;
import Modelo.entidades.dao.impl.TelefoneDaoJDBC;
import db.DB;

public class DaoFactory {
    public static LocalidadeDao createLocalidadeDao(){
        return new LocalidadeDaoJDBC(DB.getConnection());
    }

    public static TelefoneDaoJDBC createTelefoneDao(){ return new TelefoneDaoJDBC(DB.getConnection()); }

    public static PessoaFisicaDaoJDBC createPesosaFisicaDao(){ return new PessoaFisicaDaoJDBC(DB.getConnection()); }


}
