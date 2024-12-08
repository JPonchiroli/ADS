package Modelo.entidades;

import java.util.Date;

public class ContaCorrente extends ContaBancaria {

    private double valorCestaServicos;
    private double limitePixNoturno;

    public ContaCorrente(){}

    public ContaCorrente(Banco banco, int agencia, long numero, double saldo, Date dataAbertura,
                         String titular, double valorCestaServicos, double limitePixNoturno) {
        super(banco, agencia, numero, saldo, dataAbertura, titular);
        this.valorCestaServicos = valorCestaServicos;
        this.limitePixNoturno = limitePixNoturno;
    }

    public double getValorcestaservicos() {
        return valorCestaServicos;
    }

    public void setValorcestaservicos(double valorCestaServicos) {
        this.valorCestaServicos = valorCestaServicos;
    }

    public double getLimitepixnoturno() {
        return limitePixNoturno;
    }

    public void setLimitepixnoturno(double limitePixNoturno) {
        this.limitePixNoturno = limitePixNoturno;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "valorCestaServicos=" + valorCestaServicos +
                ", limitePixNoturno=" + limitePixNoturno +
                '}';
    }
}
