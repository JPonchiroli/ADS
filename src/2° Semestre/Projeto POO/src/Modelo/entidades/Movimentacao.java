package Modelo.entidades;

import java.util.Date;

public class Movimentacao {

    private ContaBancaria contabancaria;
    private Date data;

    private long evento;

    private double valor;


    public ContaBancaria getContabancaria() {
        return contabancaria;
    }

    public void setContabancaria(ContaBancaria contabancaria) {
        this.contabancaria = contabancaria;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public long getEvento() {
        return evento;
    }

    public void setEvento(long evento) {
        this.evento = evento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "movimentacao{" +
                "mcontabancaria=" + contabancaria +
                ", data=" + data +
                ", evento=" + evento +
                ", valor=" + valor +
                '}';
    }
}
