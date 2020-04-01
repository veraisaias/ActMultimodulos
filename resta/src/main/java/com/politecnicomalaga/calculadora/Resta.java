package com.politecnicomalaga.calculadora;

import org.apache.commons.math3.analysis.function.Subtract;

public class Resta {
    private Subtract resta;

    public Resta(){
        resta = new Subtract();
    }

    public double restar(double rest1, double rest2){
        return resta.value(rest1,rest2);
    }
}
