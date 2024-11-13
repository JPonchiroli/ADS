package Modelo.entidades;

public class Banco {

    private long codigo;

    private String nome;

    private String mascaraagencia;

    private String mascaraconta;

    public Banco(){
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

    public String getMascaraagencia() {
        return mascaraagencia;
    }

    public void setMascaraagencia(String mascaraagencia) {
        this.mascaraagencia = mascaraagencia;
    }

    public String getMascaraconta() {
        return mascaraconta;
    }

    public void setMascaraconta(String mascaraconta) {
        this.mascaraconta = mascaraconta;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", mascaraagencia='" + mascaraagencia + '\'' +
                ", mascaraconta='" + mascaraconta + '\'' +
                '}';
    }
}
