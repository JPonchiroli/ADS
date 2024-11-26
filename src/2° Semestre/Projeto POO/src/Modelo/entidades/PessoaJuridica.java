package Modelo.entidades;

public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private String razaoSocial;
    private String nomeFantasia;
    private String inscrEstadual;

    public PessoaJuridica(){}

    public PessoaJuridica(String CNPJ, String razaoSocial, String nomeFantasia, String inscrEstadual) {
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscrEstadual = inscrEstadual;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getnomeFantasia() {
        return nomeFantasia;
    }

    public void setnomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscrEstadual() {
        return inscrEstadual;
    }

    public void setInscrEstadual(String inscrEstadual) {
        this.inscrEstadual = inscrEstadual;
    }

    @Override
    public String toString() {
        return "PessoaJuridica [" +
                "CNPJ: " + CNPJ +
                ", razaoSocial: " + razaoSocial +
                ", nomeFantasia: " + nomeFantasia +
                ", inscrEstadual: " + inscrEstadual +
                ']';
    }
}

