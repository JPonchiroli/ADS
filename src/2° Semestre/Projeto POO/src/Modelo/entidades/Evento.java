package Modelo.entidades;

public class Evento {

    private long id;

    private String descricao;

    private int tipomovimentacao;

    private int situacao;

    public Evento(){
    }

    public Evento(long id, String descricao, int tipomovimentacao, int situacao) {
        this.id = id;
        this.descricao = descricao;
        this.tipomovimentacao = tipomovimentacao;
        this.situacao = situacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipomovimentacao() {
        return tipomovimentacao;
    }

    public void setTipomovimentacao(int tipomovimentacao) {
        this.tipomovimentacao = tipomovimentacao;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "evento{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", tipomovimentacao=" + tipomovimentacao +
                ", situacao=" + situacao +
                '}';
    }
}

