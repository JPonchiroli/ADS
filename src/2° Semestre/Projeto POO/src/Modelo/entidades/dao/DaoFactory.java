package Modelo.entidades.dao;

import Modelo.entidades.dao.impl.LocalidadeDaoJDBC;
import Modelo.entidades.dao.impl.PessoaFisicaDaoJDBC;
import db.DB;

public class DaoFactory {
    public static LocalidadeDao createLocalidadeDao(){
        return new LocalidadeDaoJDBC(DB.getConnection());
    }

    public static PessoaFisicaDaoJDBC createPessoaFisicaDao() {
        return new PessoaFisicaDaoJDBC(DB.getConnection());
    }
}
