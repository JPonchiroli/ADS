package Modelo.Entidades.Enums;

public enum SituacaoEnum {
    ATIVO(1),
    INATIVO(2);

    private int codigo;

    private SituacaoEnum(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }
    public static SituacaoEnum valueOf(int codigo){
        for (SituacaoEnum value: SituacaoEnum.values()){
            if (value.getCodigo() == codigo){
                return value;
            }
        }
        throw new IllegalArgumentException("Codigo de situação Inválido");
    }
}


