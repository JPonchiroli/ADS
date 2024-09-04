package Classes;

public class ContaBancaria extends Pessoa{
    private int numeroBanco;
    private int numeroAgencia;
    private int numeroConta;
    private double saldoConta;
    private boolean movimentacao;
    private boolean contaAtiva;

    public ContaBancaria(long CPF, String nome, long telefone, int numeroBanco, int numeroAgencia, int numeroConta, double saldoConta, boolean movimentacao, boolean contaAtiva) {
        super(CPF, nome, telefone);
        this.numeroBanco = numeroBanco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.movimentacao = movimentacao;
        this.contaAtiva = contaAtiva;
    }

    public double Sacar(double valorSacado){
        double valorFinal = saldoConta - valorSacado;
        if(valorFinal < 0){
            System.out.println("Operação Inválida!");
        } else {
            saldoConta -= valorSacado;
        }

        return saldoConta;
    }

    public double Depositar(double valorSacado){
        double valorFinal = saldoConta + valorSacado;
        if(valorFinal < 0){
            System.out.println("Operação Inválida!");
        } else {
            saldoConta += valorSacado;
        }

        return saldoConta;
    }

    public void ImprimirExtrato(){
        System.out.println("Extrato Atual: " + saldoConta);
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

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
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
}
