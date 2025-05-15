package aula_hash;

public class Aluno {
    private String nome;
    private Integer matricula;
    private Double mediaGeral;
    private Aluno prox;

    public Aluno(){}

    public Aluno(String nome, Integer matricula, Double mediaGeral) {
        this.nome = nome;
        this.matricula = matricula;
        this.mediaGeral = mediaGeral;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(Double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public Aluno getProx() {
        return prox;
    }

    public void setProx(Aluno prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return nome + " " + matricula;
    }
}
