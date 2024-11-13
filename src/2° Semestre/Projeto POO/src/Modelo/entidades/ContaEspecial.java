package Modelo.entidades;

import java.util.Date;

public class ContaEspecial extends ContaCorrente{
    private double limitecredito;
    private Date datavctocontrato;

    public ContaEspecial() {
    }

    public ContaEspecial(double limitecredito, Date datavctocontrato) {
        this.limitecredito = limitecredito;
        this.datavctocontrato = datavctocontrato;
    }


    public double getLimitecredito() {
        return limitecredito;
    }

    public void setLimitecredito(double limitecredito) {
        this.limitecredito = limitecredito;
    }

    public Date getDatavctocontrato() {
        return datavctocontrato;
    }

    public void setDatavctocontrato(Date datavctocontrato) {
        this.datavctocontrato = datavctocontrato;
    }

    @Override
    public String toString() {
        return "contaespecial{" +
                "limitecredito=" + limitecredito +
                ", datavctocontrato=" + datavctocontrato +
                '}';
    }
}

