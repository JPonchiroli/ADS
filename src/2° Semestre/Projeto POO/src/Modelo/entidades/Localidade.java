package Modelo.entidades;

public class Localidade {
    private Long CEP;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;

    public Localidade(){}

    public Localidade(Long CEP, String estado, String cidade, String bairro, String logradouro) {
        this.CEP = CEP;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public Long getCEP() {
        return CEP;
    }

    public void setCEP(Long CEP) {
        this.CEP = CEP;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return "Localidade [" +
                "CEP: " + CEP +
                ", estado: '" + estado +
                ", cidade: " + cidade +
                ", bairro: " + bairro +
                ", logradouro: " + logradouro +
                ']';
    }
}
