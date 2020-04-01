package com.politecnicomalaga.calculadora;

public class Calculadora {
    public static void main(String[] args) {
        double[] datosSuma = {1,5,9,10};
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multi = new Multiplicacion();
        Division division = new Division();

        System.out.println(suma.sumar(datosSuma,0));
        System.out.println(resta.restar(20,15));
        System.out.println(multi.multiplicar(5,10));
        System.out.println(division.dividir(100,2));
    }
}
