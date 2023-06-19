package com.calculator;

public enum CalculatorAction {

    ADD(R.string.plus),
    SUBTRACT(R.string.substract),
    DIVIDE(R.string.divide),
    MULTIPLY(R.string.multiply);

    private final int symbol;

    CalculatorAction(int symbol){
        this.symbol = symbol;
    }

    public int getSymbol(){
        return symbol;
    }

}
