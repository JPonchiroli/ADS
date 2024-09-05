package Utils;

import Enumerados.FillSide;

public class Utils {

    public static final String MascaraCPF = "$1.$2.$3-4";
    public static final String MascaraFone = "($1) $2-$3";

    public static final String RegExCpf = "(\\d{3})(\\d{3})(\\d{3})(\\d{2})";

    public static final String RegExFoneMovel = "(\\d{2})(\\d{5})(\\d{4})";
    public static boolean CPFValido(String CPF){

        String Aux = CPF.replaceAll("[^0-9]", "");
        char   DV;
        int    Soma, Resto;

        if (Aux.length() != 11)
            return false;

        if ((Aux.equals("00000000000")) || (Aux.equals("11111111111")) ||
                (Aux.equals("22222222222")) || (Aux.equals("33333333333")) ||
                (Aux.equals("44444444444")) || (Aux.equals("55555555555")) ||
                (Aux.equals("66666666666")) || (Aux.equals("77777777777")) ||
                (Aux.equals("88888888888")) || (Aux.equals("99999999999")))
            return false;

        Soma = 0;
        for ( int i = 0; i < 9; i++ )
            Soma += ((Aux.charAt(i) - 48) * (10 - i));

        Resto = 11 - (Soma % 11);
        if (Resto >= 10)
            DV = '0';
        else
            DV = (char)(Resto + 48);

        if (Aux.charAt(9) != DV)
            return false;

        Soma = 0;
        for ( int i = 0; i < 10; i++ )
            Soma += ((Aux.charAt(i) - 48) * (11 - i));

        Resto = 11 - (Soma % 11);
        if (Resto >= 10)
            DV = '0';
        else
            DV = (char)(Resto + 48);

        if (Aux.charAt(10) != DV)
            return false;

        return true;
    }

    public static boolean TelefoneValido(String Telefone){

        String primeiraPosicao = String.valueOf(Telefone.charAt(0)), terceiraPosicao = String.valueOf(Telefone.charAt(2));

        if(primeiraPosicao.equals("0") || !terceiraPosicao.equals("9")){
            return false;
        }

        if(Telefone.length() != 11){
            return false;
        }

        return true;
    }


    public static String Fill(String Str, char Chr, FillSide Lado, int Tamanho)
    {
        String Aux = Str;

        while (Aux.length() < Tamanho)
            if (Lado == FillSide.fsDireita)
                Aux = Aux + Chr;
            else
                Aux = Chr + Aux;

        return Aux;
    }
}
