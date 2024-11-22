package Modelo.entidades;


public class Pessoa {
    private Long id;
    private Localidade cep;
    private int numeroEnd;
    private String complementoEnd;
    private String situacao;

    public Pessoa(){}

    public Pessoa(Long id, Localidade cep, int numeroEnd, String complementoEnd, String situacao) {
        this.id = id;
        this.cep = cep;
        this.numeroEnd = numeroEnd;
        this.complementoEnd = complementoEnd;
        setSituacao(situacao);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Localidade getCep() {
        return cep;
    }

    public void setCep(Localidade cep) {
        this.cep = cep;
    }

    public int getNumeroEnd() {
        return numeroEnd;
    }

    public void setNumeroEnd(int numeroEnd) {
        this.numeroEnd = numeroEnd;
    }

    public String getComplementoEnd() {
        return complementoEnd;
    }

    public void setComplementoEnd(String complementoEnd) {
        this.complementoEnd = complementoEnd;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Pessoa [" +
                "id: " + id +
                ", cep: " + cep +
                ", numeroEnd: " + numeroEnd +
                ", complementoEnd: " + complementoEnd +
                ", situacao: " + situacao +
                ']';
    }
}
