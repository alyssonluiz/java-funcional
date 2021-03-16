package br.com.digital.innovation.one.aula1;

import java.util.function.UnaryOperator;

public class Aula {
    //paradigma imperativo
   /* public static void main(String[] args){
        int valor = 10;
        int resultado = 10*3;

        System.out.println("O resultado é: " + resultado);
    }*/

    //paradigma funcional
    public static void main(String[] args){
        UnaryOperator<Integer> calcularValorVezesTres = valor -> valor*3;//um conceito paradigma funcional
        int valor = 10;
        System.out.println("O resultado é: " + calcularValorVezesTres.apply(10));
    }
}
