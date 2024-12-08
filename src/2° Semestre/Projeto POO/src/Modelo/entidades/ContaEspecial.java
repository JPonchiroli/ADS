package Modelo.entidades;

import java.util.Date;

public class ContaEspecial extends ContaCorrente{
    private double limiteCredito;
    private Date dataVctoContrato;

    public ContaEspecial() {
    }

    public ContaEspecial(double limiteCredito, Date dataVctoContrato) {
        this.limiteCredito = limiteCredito;
        this.dataVctoContrato = dataVctoContrato;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Date getDataVctoContrato() {
        return dataVctoContrato;
    }

    public void setDataVctoContrato(Date dataVctoContrato) {
        this.dataVctoContrato = dataVctoContrato;
    }

    @Override
    public String toString() {
        return "contaespecial{" +
                "limiteCredito=" + limiteCredito +
                ", dataVctoContrato=" + dataVctoContrato +
                '}';
    }
}

