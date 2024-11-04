package Entidades.Enums;

public enum TipoTelefoneEnum {
    MOVEL(1),
    RESIDENCIAL(2);

    private int codigo;

    private TipoTelefoneEnum(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public static TipoTelefoneEnum valueOf(int codigo){
        for (TipoTelefoneEnum value: TipoTelefoneEnum.values()){
            if (value.getCodigo() == codigo){
                return value;
            }
        }
        throw new IllegalArgumentException("Tipo de telefone invalido");
    }
}
