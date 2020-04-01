package com.politecnicomalaga.calculadora;

import org.apache.commons.math3.analysis.function.Multiply;

public class Multiplicacion {
    private Multiply multi;

    public Multiplicacion(){
        multi = new Multiply();
    }

    public double multiplicar(double mult1, double mult2){
        return multi.value(mult1,mult2);
    }
}
