package com.politecnicomalaga.calculadora;

import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class Suma {
    private Sum suma;

    public Suma(){
        suma = new Sum();
    }
    public double sumar(double[] datos, int inicio){
        return suma.evaluate(datos,inicio,datos.length);
    }
}
