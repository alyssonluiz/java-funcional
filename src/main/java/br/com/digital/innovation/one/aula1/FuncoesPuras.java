package br.com.digital.innovation.one.aula1;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    //é chamada de pura quando uma função é invocada mais de uma vez e produz exatamente o mesmo resultado
    public static void main(String[] args){
        BiPredicate<Integer, Integer> verificarSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeEMaior.test(13,12));
        System.out.println(verificarSeEMaior.test(13,12));
    }
}
