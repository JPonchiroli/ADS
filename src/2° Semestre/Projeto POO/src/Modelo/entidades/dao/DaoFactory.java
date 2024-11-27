package Modelo.entidades.dao;

import Modelo.entidades.dao.impl.*;
import db.DB;

public class DaoFactory {
    public static LocalidadeDao createLocalidadeDao(){
        return new LocalidadeDaoJDBC(DB.getConnection());
    }

    public static TelefoneDaoJDBC createTelefoneDao(){ return new TelefoneDaoJDBC(DB.getConnection()); }

    public static PessoaFisicaDaoJDBC createPesosaFisicaDao(){ return new PessoaFisicaDaoJDBC(DB.getConnection()); }

    public static PessoaJuridicaDao createPessoaJuridicaDao() { return new PessoaJuridicaDaoJDBC(DB.getConnection()); }

    public static BancoDao createBancoDao() { return new BancoDaoJDBC(DB.getConnection()); }

    public static EventoDao createEventoDao() { return new EventoDaoJDBC(DB.getConnection()); }

    public static CotacoesDao createCotacoesDao() { return new CotacoesDaoJDBC(DB.getConnection()); }

    public static IndiceRemuneracaoDao createIndiceRemuneracao() { return new IndiceRemuneracaoDaoJDBC(DB.getConnection()) {
    }; }
}
