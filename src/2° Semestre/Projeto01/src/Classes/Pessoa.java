package Classes;

import Enumerados.FillSide;
import Utils.Utils;

import static Utils.Utils.*;

public class Pessoa {

    private long CPF;
    private String nome;
    private long telefone;

    public Pessoa(long CPF, String nome, long telefone) {
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Pessoa() {

    }

    public String getCPF() {
        String aux = Utils.Fill(Long.toString(this.CPF), '0', FillSide.fsEsquerda, 11);
        return aux.replaceAll(RegExCpf, MascaraCPF);
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
        String aux = Utils.Fill(Long.toString(this.telefone), '0', FillSide.fsEsquerda, 11);
        return aux.replaceAll(RegExFoneMovel, MascaraFone);
    }

    public void setTelefone(String telefone) {
        if(TelefoneValido(telefone)){
            this.telefone = Long.parseLong(telefone.replaceAll("[^0-9]", ""));
        }
    }
}
