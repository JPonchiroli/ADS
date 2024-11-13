package Modelo.entidades;

public class ContaSalario extends ContaBancaria{

    private String cnpjvinculado;

    private double limiteconsignado;

    private double limiteantecipacaomes;

    private boolean permiteantecipar13o;

    private long ContaVinculada;

    public String getCnpjvinculado() {
        return cnpjvinculado;
    }

    public void setCnpjvinculado(String cnpjvinculado) {
        this.cnpjvinculado = cnpjvinculado;
    }

    public double getLimiteconsignado() {
        return limiteconsignado;
    }

    public void setLimiteconsignado(double limiteconsignado) {
        this.limiteconsignado = limiteconsignado;
    }

    public double getLimiteantecipacaomes() {
        return limiteantecipacaomes;
    }

    public void setLimiteantecipacaomes(double limiteantecipacaomes) {
        this.limiteantecipacaomes = limiteantecipacaomes;
    }

    public boolean isPermiteantecipar13o() {
        return permiteantecipar13o;
    }

    public void setPermiteantecipar13o(boolean permiteantecipar13o) {
        this.permiteantecipar13o = permiteantecipar13o;
    }

    public long getContaVinculada() {
        return ContaVinculada;
    }

    public void setContaVinculada(long contaVinculada) {
        ContaVinculada = contaVinculada;
    }

    @Override
    public String toString() {
        return "contasalario{" +
                "cnpjvinculado='" + cnpjvinculado + '\'' +
                ", limiteconsignado=" + limiteconsignado +
                ", limiteantecipacaomes=" + limiteantecipacaomes +
                ", permiteantecipar13o=" + permiteantecipar13o +
                ", ContaVinculada=" + ContaVinculada +
                '}';
    }
}

