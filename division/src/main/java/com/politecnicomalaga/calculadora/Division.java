package com.politecnicomalaga.calculadora;

import org.apache.commons.math3.analysis.function.Divide;

public class Division {
    private Divide division;

    public Division(){
        division = new Divide();
    }

    public double dividir(double div1, double div2){
        return division.value(div1,div2);
    }
}
