package Classes;

import Enumerados.FillSide;
import Utils.Utils;

import static Utils.Utils.*;

public abstract class ContaBancaria{

    private long  CPF;
    private int numeroBanco;
    private int numeroAgencia;
    private String numeroConta;
    private double saldoConta;
    private boolean movimentacao;
    private boolean contaAtiva;

    public ContaBancaria(){
        this.contaAtiva = true;
        this.saldoConta = 0;
    }
    public ContaBancaria(long CPF, int numeroBanco, int numeroAgencia, String numeroConta, double saldoConta, boolean movimentacao, boolean contaAtiva) {
        this.CPF = CPF;
        this.numeroBanco = numeroBanco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.movimentacao = movimentacao;
        this.contaAtiva = true;
        this.saldoConta = 0;
    }

    public void AumentarValor(double valorSacado){
        double valorFinal = saldoConta - valorSacado;
        if(valorFinal < 0 && this.contaAtiva){
            System.out.println("Operação Inválida!");
        } else {
            saldoConta -= valorSacado;
        }
    }

    public void DiminuirValor(double valorSacado){
        double valorFinal = saldoConta + valorSacado;
        if(this.contaAtiva){
            System.out.println("Operação Inválida!");
        } else {
            saldoConta += valorSacado;
        }
    }

    public void ImprimirExtrato(){
        System.out.println("Extrato Atual: " + saldoConta);
    }

    public void EncerrarConta(){
        if(this.contaAtiva ){
            if(this.getSaldoConta() != 0) {
                DiminuirValor(this.getSaldoConta());
            }
            DiminuirValor(this.getSaldoConta());
        }
    }


    public String getCPF() {
        String aux = Utils.Fill(Long.toString(this.CPF), '0', FillSide.fsEsquerda, 11);
        return aux.replaceAll(RegExCpf, MascaraCPF);
    }

    public void setCPF(String CPF) {
        if(CPFValido(CPF)){
            this.CPF = Long.parseLong(CPF.replaceAll("[^0-9]", ""));
        }
    }
    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public boolean isMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(boolean movimentacao) {
        this.movimentacao = movimentacao;
    }

    public boolean isContaAtiva() {
        return contaAtiva;
    }

    public void setContaAtiva(boolean contaAtiva) {
        this.contaAtiva = true;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "CPF=" + CPF +
                ", numeroBanco=" + numeroBanco +
                ", numeroAgencia=" + numeroAgencia +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldoConta=" + saldoConta +
                ", movimentacao=" + movimentacao +
                ", contaAtiva=" + contaAtiva +
                '}';
    }
}
