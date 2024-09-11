package Classes;

import java.util.Date;

public class EventoConta {
    private String evento;
    private Date horaEvento;
    private double saldoAntesDoMovimento;
    private double valorMovimentacao;

    public EventoConta(String evento, Date horaEvento, double saldoAntesDoMovimento, double valorMovimentacao) {
        this.evento = evento;
        this.horaEvento = horaEvento;
        this.saldoAntesDoMovimento = saldoAntesDoMovimento;
        this.valorMovimentacao = valorMovimentacao;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public Date getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(Date horaEvento) {
        this.horaEvento = horaEvento;
    }

    public double getSaldoAntesDoMovimento() {
        return saldoAntesDoMovimento;
    }

    public void setSaldoAntesDoMovimento(double saldoAntesDoMovimento) {
        this.saldoAntesDoMovimento = saldoAntesDoMovimento;
    }

    public double getValorMovimentacao() {
        return valorMovimentacao;
    }

    public void setValorMovimentacao(double valorMovimentacao) {
        this.valorMovimentacao = valorMovimentacao;
    }
}
