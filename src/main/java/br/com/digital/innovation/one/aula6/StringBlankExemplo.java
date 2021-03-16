package br.com.digital.innovation.one.aula6;

public class StringBlankExemplo {
    public static void main(String[] args) {
        String espaco = "                                       ";
        //System.out.println(espaco != null || espaco.length() == 0 || espaco.chars().allMatch(c -> c == ' '));
        System.out.println(espaco.isBlank());
    }
}