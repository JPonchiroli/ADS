package Modelo.entidades;

public class Evento {

    private long id;

    private String descricao;

    private String tipoMovimentacao;

    private String situacao;

    public Evento(){
    }

    public Evento(long id, String descricao, String tipoMovimentacao, String situacao) {
        this.id = id;
        this.descricao = descricao;
        this.tipoMovimentacao = tipoMovimentacao;
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

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "evento{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", tipoMovimentacao=" + tipoMovimentacao +
                ", situacao=" + situacao +
                '}';
    }
}

