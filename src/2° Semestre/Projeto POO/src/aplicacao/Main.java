package aplicacao;

import Modelo.entidades.*;
import Modelo.entidades.dao.*;
import Modelo.entidades.dao.impl.LocalidadeDaoJDBC;
import db.DB;

import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
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
        /*
        PessoaFisicaDao pessoaFisicaDao = DaoFactory.createPesosaFisicaDao();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2006, Calendar.MARCH, 27);
        Date dtNasc = calendar.getTime();

        PessoaFisica pessoaFisica = new PessoaFisica(10909208905l, "Joao Ponchiroli", dtNasc, "Masculino");
        pessoaFisicaDao.inserir(pessoaFisica);

        System.out.println(pessoaFisicaDao.buscarPorCPF(10909208905l));

        System.out.println(pessoaFisicaDao.buscarTodos());
         */
        //--------------------------------------------------------------------------------------------------------------
        // Pessoa Juridica
        /*
        PessoaJuridicaDao pessoaJuridicaDao = DaoFactory.createPessoaJuridicaDao();

        PessoaJuridica pessoaJuridica = new PessoaJuridica("46561332000146", "Kaleo Ltda", "Jamika", "SC");
        pessoaJuridicaDao.inserir(pessoaJuridica);

        System.out.println(pessoaJuridicaDao.buscarPorCNPJ("46561332000146"));

        System.out.println(pessoaJuridicaDao.buscarTodos());
        */
        //--------------------------------------------------------------------------------------------------------------
        // Banco
        /*
        BancoDao bancoDao = DaoFactory.createBancoDaoDao();

        Banco banco = new Banco(123l, "banco do brasil", "XXX-XX", "XXXXX-XXX");
        bancoDao.inserir(banco);


        System.out.println(bancoDao.buscarPorCodigo(123l));

        System.out.println(bancoDao.buscarTodos());
        */
        //--------------------------------------------------------------------------------------------------------------
        // Evento
        /*
        EventoDao eventoDao = DaoFactory.createEventoDao();

        Evento evento = new Evento(123l, "Evento X", "XXX-XX", "Ativo");
        eventoDao.inserir(evento);


        System.out.println(eventoDao.buscarPorId(123l));

        System.out.println(eventoDao.buscarTodos());
        */
        //--------------------------------------------------------------------------------------------------------------
    }
}
