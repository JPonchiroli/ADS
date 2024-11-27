package Modelo.entidades;

public class ContaPoupanca extends ContaBancaria{

    private IndiceRemuneracao indiceRemuneracao;

    private int diaAniversario;

    private double percRendimentoReal;

    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(IndiceRemuneracao indiceRemuneracao, int diaAniversario, double percRendimentoReal) {
        super();
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

    public int getdiaAniversario() {
        return diaAniversario;
    }

    public void setdiaAniversario(int diaAniversario) {
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

