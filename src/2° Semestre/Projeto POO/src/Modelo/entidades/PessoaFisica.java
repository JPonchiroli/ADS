package Modelo.entidades;

import java.util.Date;

public class PessoaFisica extends Pessoa{

    private Long CPF;
    private String nome;
    private Date dtNasc;

    private String sexo;

    public PessoaFisica(){}

    public PessoaFisica(Long CPF, String nome, Date dtNasc, String sexo) {
        this.CPF = CPF;
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.sexo = sexo;
    }

    public Long getCPF() {
        return CPF;
    }

    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getdtNasc() {
        return dtNasc;
    }

    public void setdtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "PessoaFisica [" +
                "CPF: " + CPF +
                ", nome: " + nome +
                ", dtNasc: " + dtNasc +
                ", sexo: " + sexo +
                ']';
    }
}
