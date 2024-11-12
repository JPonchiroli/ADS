package Modelo.entidades;

import Modelo.entidades.enums.SexoEnum;

import java.util.Date;

public class PessoaFisica extends Pessoa{
    private Long CPF;
    private String nome;
    private Date dtNasc;

    private Integer sexo;

    public PessoaFisica(){}

    public PessoaFisica(Long CPF, String nome, Date dtNasc, SexoEnum sexo) {
        this.CPF = CPF;
        this.nome = nome;
        this.dtNasc = dtNasc;
        setSexo(sexo);
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

    public SexoEnum getSexo() {
        return SexoEnum.valueOf(sexo);
    }

    public void setSexo(SexoEnum sexo) {
        if (sexo != null){
            this.sexo = sexo.getCodigo();
        }
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
