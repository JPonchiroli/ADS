package Modelo.entidades;

import java.util.Date;

public  abstract class ContaBancaria {

    private long id;
    private Banco banco;
    private int agencia;
    private long numero;

    private double saldo;

    private Date dataabertura;

    private String titular;

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

    public Date getDataabertura() {
        return dataabertura;
    }

    public void setDataabertura(Date dataabertura) {
        this.dataabertura = dataabertura;
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
                ", dataabertura=" + dataabertura +
                ", titular='" + titular + '\'' +
                '}';
    }
}
