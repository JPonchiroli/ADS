package Modelo.entidades;

public class ContaPoupanca extends ContaBancaria{

    private IndiceRemuneracao indiceRemuneracao;

    private int diaaniversario;

    private double percrendimentoreal;


    public IndiceRemuneracao getIndiceRemuneracao() {
        return indiceRemuneracao;
    }

    public void setIndiceRemuneracao(IndiceRemuneracao indiceRemuneracao) {
        this.indiceRemuneracao = indiceRemuneracao;
    }

    public int getDiaaniversario() {
        return diaaniversario;
    }

    public void setDiaaniversario(int diaaniversario) {
        this.diaaniversario = diaaniversario;
    }

    public double getPercrendimentoreal() {
        return percrendimentoreal;
    }

    public void setPercrendimentoreal(double percrendimentoreal) {
        this.percrendimentoreal = percrendimentoreal;
    }

    @Override
    public String toString() {
        return "contapoupanca{" +
                "cpindiceremuneracao=" + indiceRemuneracao +
                ", diaaniversario=" + diaaniversario +
                ", percrendimentoreal=" + percrendimentoreal +
                '}';
    }
}

