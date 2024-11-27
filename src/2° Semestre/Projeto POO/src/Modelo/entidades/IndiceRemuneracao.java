package Modelo.entidades;

public class IndiceRemuneracao {

    private long codigo;

    private String descricao;

    private String periodicidade;

    private String situacao;

    public IndiceRemuneracao() {
    }

    public IndiceRemuneracao(long codigo, String descricao, String periodicidade, String situacao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.periodicidade = periodicidade;
        this.situacao = situacao;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "indiceremuneracao{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", periodicidade=" + periodicidade +
                ", situacao=" + situacao +
                '}';
    }
}
