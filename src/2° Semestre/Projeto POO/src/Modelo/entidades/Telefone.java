package Modelo.entidades;

public class Telefone {
    private Long id;
    private Long numeroTelefone;
    private String tipoTelefone;

    public Telefone(){}

    public Telefone( Long numeroTelefone, String tipoTelefone) {
        this.numeroTelefone = numeroTelefone;
        this.tipoTelefone = tipoTelefone;
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

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "id=" + id +
                ", numeroTelefone=" + numeroTelefone +
                ", tipoTelefone='" + tipoTelefone + '\'' +
                '}';
    }
}
