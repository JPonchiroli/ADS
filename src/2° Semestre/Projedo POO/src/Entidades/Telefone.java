package Entidades;

import Entidades.Enums.TipoTelefoneEnum;

public class Telefone {
    private Long id;
    private Long numeroTelefone;
    private Integer tipoTelefone;

    public Telefone(){}

    public Telefone(Long id, Long numeroTelefone, TipoTelefoneEnum tipoTelefone) {
        this.id = id;
        this.numeroTelefone = numeroTelefone;
        setTipoTelefone(tipoTelefone);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(Long numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public TipoTelefoneEnum getTipoTelefone() {
        return TipoTelefoneEnum.valueOf(tipoTelefone);
    }

    public void setTipoTelefone(TipoTelefoneEnum tipoTelefone) {
        if (tipoTelefone != null) {
            this.tipoTelefone = tipoTelefone.getCodigo();
        }
    }
}
