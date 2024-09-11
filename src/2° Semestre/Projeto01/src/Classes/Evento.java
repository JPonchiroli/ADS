package Classes;

public class Evento {
    private long codigoEvento;
    private String descricaoEvento;
    private String tipoOperacao;
    private boolean eventoAtivo;

    public Evento(long codigoEvento, String descricaoEvento, String tipoOperacao, boolean eventoAtivo) {
        this.codigoEvento = codigoEvento;
        this.descricaoEvento = descricaoEvento;
        this.tipoOperacao = tipoOperacao;
        this.eventoAtivo = true;
    }

    public void DesativarEvento(){
        this.eventoAtivo = false;
    }

    public long getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(long codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public boolean isEventoAtivo() {
        return eventoAtivo;
    }

    public void setEventoAtivo(boolean eventoAtivo) {
        this.eventoAtivo = eventoAtivo;
    }
}
