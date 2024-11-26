package Modelo.entidades;

public class Banco {

    private long codigo;

    private String nome;

    private String mascaraAgencia;

    private String mascaraConta;

    public Banco(){
    }

    public Banco(long codigo, String nome, String mascaraAgencia, String mascaraConta) {
        this.codigo = codigo;
        this.nome = nome;
        this.mascaraAgencia = mascaraAgencia;
        this.mascaraConta = mascaraConta;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getmascaraAgencia() {
        return mascaraAgencia;
    }

    public void setmascaraAgencia(String mascaraAgencia) {
        this.mascaraAgencia = mascaraAgencia;
    }

    public String getmascaraConta() {
        return mascaraConta;
    }

    public void setmascaraConta(String mascaraConta) {
        this.mascaraConta = mascaraConta;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", mascaraAgencia='" + mascaraAgencia + '\'' +
                ", mascaraConta='" + mascaraConta + '\'' +
                '}';
    }
}
