package Classes;

import Enumerados.FillSide;
import Utils.Utils;

import static Utils.Utils.CPFValido;
import static Utils.Utils.MascaraCPF;

public class Pessoa {

    private long CPF;
    private String nome;
    private long telefone;

    public Pessoa(long CPF, String nome, long telefone) {
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getCPF() {
        String aux = Utils.Fill(Long.toString(this.CPF), '0', FillSide.fsEsquerda, 11);
        return aux.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})",MascaraCPF);
    }

    public void setCPF(String CPF) {
        if(CPFValido(CPF)){
            this.CPF = Long.parseLong(CPF.replaceAll("[^0-9]", ""));
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return Long.toString(telefone);
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
}
