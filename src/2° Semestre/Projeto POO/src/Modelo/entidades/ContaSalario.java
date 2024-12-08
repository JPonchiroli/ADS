package Modelo.entidades;

import java.util.Date;

public class ContaSalario extends ContaBancaria{

    private String cnpjVinculado;

    private double limiteConsignado;

    private double limiteAntecipacaoMes;

    private boolean permiteAntecipar13o;

    private Long contaVinculada;

    public ContaSalario(){}

    public ContaSalario(Banco banco, int agencia, long numero, double saldo, Date dataAbertura, String titular, String cnpjVinculado, double limiteConsignado, double limiteAntecipacaoMes, boolean permiteAntecipar13o, Long contaVinculada) {
        super(banco, agencia, numero, saldo, dataAbertura, titular);
        this.cnpjVinculado = cnpjVinculado;
        this.limiteConsignado = limiteConsignado;
        this.limiteAntecipacaoMes = limiteAntecipacaoMes;
        this.permiteAntecipar13o = permiteAntecipar13o;
        this.contaVinculada = contaVinculada;
    }

    public String getCnpjVinculado() {
        return cnpjVinculado;
    }

    public void setCnpjvinculado(String cnpjVinculado) {
        this.cnpjVinculado = cnpjVinculado;
    }

    public double getLimiteConsignado() {
        return limiteConsignado;
    }

    public void setLimiteconsignado(double limiteConsignado) {
        this.limiteConsignado = limiteConsignado;
    }

    public double getLimiteAntecipacaoMes() {
        return limiteAntecipacaoMes;
    }

    public void setLimiteantecipacaomes(double limiteAntecipacaoMes) {
        this.limiteAntecipacaoMes = limiteAntecipacaoMes;
    }

    public boolean isPermiteAntecipar13o() {
        return permiteAntecipar13o;
    }

    public void setPermiteantecipar13o(boolean permiteAntecipar13o) {
        this.permiteAntecipar13o = permiteAntecipar13o;
    }

    public Long getContaVinculada() {
        return contaVinculada;
    }

    public void setContaVinculada(Long contaVinculada) {
        contaVinculada = contaVinculada;
    }

    @Override
    public String toString() {
        return "contasalario{" +
                "cnpjVinculado='" + cnpjVinculado + '\'' +
                ", limiteConsignado=" + limiteConsignado +
                ", limiteAntecipacaoMes=" + limiteAntecipacaoMes +
                ", permiteAntecipar13o=" + permiteAntecipar13o +
                ", ContaVinculada=" + contaVinculada +
                '}';
    }
}

