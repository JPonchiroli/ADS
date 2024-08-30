public class Pessoa {

    private int CPF;
    private String nome;
    private  int telefone;

    public Pessoa(int CPF, String nome, int telefone) {
        this.CPF = CPF;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
