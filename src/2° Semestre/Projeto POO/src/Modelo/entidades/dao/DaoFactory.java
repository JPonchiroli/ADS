package Modelo.entidades.dao;

import Modelo.entidades.dao.impl.LocalidadeDaoJDBC;
import db.DB;

public class DaoFactory {
    public static LocalidadeDao createLocalidadeDao(){
        return new LocalidadeDaoJDBC(DB.getConnection());
    }
}
