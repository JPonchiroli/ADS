package aplicacao;

import Modelo.entidades.Localidade;
import Modelo.entidades.PessoaFisica;
import Modelo.entidades.Telefone;
import Modelo.entidades.dao.DaoFactory;
import Modelo.entidades.dao.LocalidadeDao;
import Modelo.entidades.dao.PessoaFisicaDao;
import Modelo.entidades.dao.TelefoneDao;
import Modelo.entidades.dao.impl.LocalidadeDaoJDBC;
import db.DB;

import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;

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
        // Pessoa Fisica

        PessoaFisicaDao pessoaFisicaDao = DaoFactory.createPesosaFisicaDao();
        /*
        Calendar calendar = Calendar.getInstance();
        calendar.set(2006, Calendar.MARCH, 27);
        Date dtNasc = calendar.getTime();

        PessoaFisica pessoaFisica = new PessoaFisica(10909208905l, "Joao Ponchiroli", dtNasc, "Masculino");
        pessoaFisicaDao.inserir(pessoaFisica);

        System.out.println(pessoaFisicaDao.buscarPorCPF(10909208905l));

        System.out.println(pessoaFisicaDao.buscarTodos());
         */


    }
}
