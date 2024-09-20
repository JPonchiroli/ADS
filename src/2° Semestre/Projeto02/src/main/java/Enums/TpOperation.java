package Enums;

public enum TpOperation {
    toDecreaseBalance('-'),
    toIncreaseBalanec('+'),
    toNotChangeBalance('=');

    private char valEnum;

    TpOperation(char c){
        this.valEnum = c;
    }

    public char getOperation(){
        return this.valEnum;
    }

}
