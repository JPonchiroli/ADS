package aplicacao;

import Modelo.entidades.*;
import Modelo.entidades.dao.*;

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
        // Cotacoes
        /*
        CotacoesDao cotacoesDao = DaoFactory.createCotacoesDao();

        Cotacoes cotacao = new Cotacoes(123l, new Date(), 500);
        cotacoesDao.inserir(cotacao);

        System.out.println(cotacoesDao.buscarPorCodido(123l));

        System.out.println(cotacoesDao.buscarTodos());
        */
        //--------------------------------------------------------------------------------------------------------------
        // Indice Remuneracao
        /*
        IndiceRemuneracaoDao indiceRemuneracaoDao = DaoFactory.createIndiceRemuneracao();

        IndiceRemuneracao indiceRemuneracao = new IndiceRemuneracao(123l, "Remuneracao estavel", "5 em 5 meses", "Ativo");
        indiceRemuneracaoDao.inserir(indiceRemuneracao);

        System.out.println(indiceRemuneracaoDao.buscaPorCodigo(123l));

        System.out.println(indiceRemuneracaoDao.buscarTodos());
        */
        //--------------------------------------------------------------------------------------------------------------
        // Conta Poupanca
        /*
        ContaPoupancaDao contaPoupancaDao = DaoFactory.createContaPoupanca();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2006, Calendar.MARCH, 27);
        Date dtNasc = calendar.getTime();

        Banco banco = new Banco(123l, "banco do brasil", "XXX-XX", "XXXXX-XXX");
        IndiceRemuneracao indiceRemuneracao = new IndiceRemuneracao(123l, "Remuneracao estavel", "5 em 5 meses", "Ativo");

        ContaPoupanca contaPoupanca = new ContaPoupanca(banco, 111-11, 1111-111, 1500, new Date(), "Joao", indiceRemuneracao, dtNasc, 55.5);
        contaPoupancaDao.inserir(contaPoupanca);

        System.out.println(contaPoupancaDao.buscaPorId(1l));

        System.out.println(contaPoupancaDao.buscarTodos());
        */
        //--------------------------------------------------------------------------------------------------------------
        // Conta Corrente
        /*
        ContaCorrenteDao contaCorrenteDao = DaoFactory.createContaCorrente();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2006, Calendar.MARCH, 27);
        Date dtNasc = calendar.getTime();

        Banco banco = new Banco(123l, "banco do brasil", "XXX-XX", "XXXXX-XXX");

        ContaCorrente contaCorrente = new ContaCorrente(banco, 111-11, 1111-111, 1500, new Date(), "Joao", 500, 15000);
        contaCorrenteDao.inserir(contaCorrente);

        System.out.println(contaCorrenteDao.buscarPorId(1));

        System.out.println(contaCorrenteDao.buscarTodos());
        */
        //--------------------------------------------------------------------------------------------------------------
        // Conta Salario
        /*
        ContaSalarioDao contaSalarioDao = DaoFactory.createContaSalario();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2006, Calendar.MARCH, 27);
        Date dtNasc = calendar.getTime();

        Banco banco = new Banco(123l, "banco do brasil", "XXX-XX", "XXXXX-XXX");
        ContaCorrente contaCorrente = new ContaCorrente(banco, 111-11, 1111-111, 1500, new Date(), "Joao", 500, 15000);

        ContaSalario contaSalario = new ContaSalario
                (banco, contaCorrente.getAgencia(), contaCorrente.getNumero(), contaCorrente.getSaldo(), contaCorrente.getDataAbertura(), contaCorrente.getTitular(),
                "12354", 15000, 5000, true, 1L);
        contaSalarioDao.inserir(contaSalario);

        System.out.println(contaSalarioDao.buscaPorId(1));

        System.out.println(contaSalarioDao.buscarTodos());
        */
        //--------------------------------------------------------------------------------------------------------------
        // Conta Especial
        /*
        ContaEspecialDao contaEspecialDao = DaoFactory.createContaEspecial();

        ContaEspecial contaEspecial = new ContaEspecial(50000, new Date());
        contaEspecialDao.inserir(contaEspecial);

        System.out.println(contaEspecialDao.buscaPorId(1));

        System.out.println(contaEspecialDao.buscarTodos());
        */
    }
}
