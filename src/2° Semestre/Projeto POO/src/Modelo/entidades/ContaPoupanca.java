package Modelo.entidades;

import java.util.Date;

public class ContaPoupanca extends ContaBancaria{

    private IndiceRemuneracao indiceRemuneracao;

    private Date diaAniversario;

    private double percRendimentoReal;

    public ContaPoupanca(){
        super();
    }


    public ContaPoupanca(Banco banco, int agencia, long numero, double saldo, Date dataAbertura,
                         String titular, IndiceRemuneracao indiceRemuneracao, Date diaAniversario, double percRendimentoReal) {
        super(banco, agencia, numero, saldo, dataAbertura, titular);
        this.indiceRemuneracao = indiceRemuneracao;
        this.diaAniversario = diaAniversario;
        this.percRendimentoReal = percRendimentoReal;
    }

    public IndiceRemuneracao getIndiceRemuneracao() {
        return indiceRemuneracao;
    }

    public void setIndiceRemuneracao(IndiceRemuneracao indiceRemuneracao) {
        this.indiceRemuneracao = indiceRemuneracao;
    }

    public Date getdiaAniversario() {
        return diaAniversario;
    }

    public void setdiaAniversario(Date diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public double getpercRendimentoReal() {
        return percRendimentoReal;
    }

    public void setpercRendimentoReal(double percRendimentoReal) {
        this.percRendimentoReal = percRendimentoReal;
    }

    @Override
    public String toString() {
        return "contapoupanca{" +
                "cpindiceremuneracao=" + indiceRemuneracao +
                ", diaAniversario=" + diaAniversario +
                ", percRendimentoReal=" + percRendimentoReal +
                '}';
    }
}

