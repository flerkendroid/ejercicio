package com.mx.lessons.lesson01;

public class DecrementExample01 {
    public static void main(String[] args) {
        int numero = 10;
        int resultado = 0;

        resultado = --numero + ++numero ;
            //        --10     + ++9
            //          9      + 10

        System.out.println("resultado: " + resultado);
    }

}
