package Modelo.entidades;

import java.util.Date;

public  abstract class ContaBancaria {

    private long id;
    private Banco banco;
    private int agencia;
    private long numero;

    private double saldo;

    private Date dataAbertura;

    private String titular;

    public ContaBancaria(){}


    public ContaBancaria(Banco banco, int agencia, long numero, double saldo, Date dataAbertura, String titular) {
        this.id = id;
        this.banco = banco;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
        this.titular = titular;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getdataAbertura() {
        return dataAbertura;
    }

    public void setdataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "contabancaria{" +
                "id=" + id +
                ", banco=" + banco +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", dataAbertura=" + dataAbertura +
                ", titular='" + titular + '\'' +
                '}';
    }
}
