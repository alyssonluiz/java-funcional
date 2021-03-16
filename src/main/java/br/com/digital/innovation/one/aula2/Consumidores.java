package br.com.digital.innovation.one.aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args){
        //Method Reference
        //  -apenas
        //  -utilizar o parametro que ele foi recebido

        //  Consumer<String> imprimirUmaFrase = System.out::println;

        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
    }
}
