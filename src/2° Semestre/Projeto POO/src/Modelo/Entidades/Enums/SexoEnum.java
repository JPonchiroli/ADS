package Modelo.Entidades.Enums;

public enum SexoEnum {
    MASCULINO(1),
    FEMININO(2);

    private int codigo;

    private SexoEnum(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }
    public static SexoEnum valueOf(int codigo){
        for (SexoEnum value: SexoEnum.values()){
            if (value.getCodigo() == codigo){
                return value;
            }
        }
        throw new IllegalArgumentException("Codigo de sexo Inválido");
    }
}


