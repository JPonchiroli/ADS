package Entidades;

public class PessoaJuridica extends Pessoa {
    private Long CNPJ;
    private String razaoSocial;
    private String nomeFantasma;
    private String inscrEstadual;

    public PessoaJuridica(){}

    public PessoaJuridica(Long CNPJ, String razaoSocial, String nomeFantasma, String inscrEstadual) {
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.nomeFantasma = nomeFantasma;
        this.inscrEstadual = inscrEstadual;
    }

    public Long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(Long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasma() {
        return nomeFantasma;
    }

    public void setNomeFantasma(String nomeFantasma) {
        this.nomeFantasma = nomeFantasma;
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
                ", nomeFantasma: " + nomeFantasma +
                ", inscrEstadual: " + inscrEstadual +
                ']';
    }
}

