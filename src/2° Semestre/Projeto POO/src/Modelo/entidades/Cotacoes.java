package Modelo.entidades;

import java.util.Date;

public class Cotacoes {

    private Long codigo;

    private Date data;

    private double valor;


    public Cotacoes(){
    }

    public Cotacoes(Long codigo, Date data, double valor) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "cotacoes{" +
                "codigo=" + codigo +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }
}

