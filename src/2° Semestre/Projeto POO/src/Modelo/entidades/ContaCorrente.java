package Modelo.entidades;

public class ContaCorrente extends ContaBancaria {

    private double valorcestaservicos;
    private double limitepixnoturno;


    public double getValorcestaservicos() {
        return valorcestaservicos;
    }

    public void setValorcestaservicos(double valorcestaservicos) {
        this.valorcestaservicos = valorcestaservicos;
    }

    public double getLimitepixnoturno() {
        return limitepixnoturno;
    }

    public void setLimitepixnoturno(double limitepixnoturno) {
        this.limitepixnoturno = limitepixnoturno;
    }

    @Override
    public String toString() {
        return "contacorrente{" +
                "valorcestaservicos=" + valorcestaservicos +
                ", limitepixnoturno=" + limitepixnoturno +
                '}';
    }
}
