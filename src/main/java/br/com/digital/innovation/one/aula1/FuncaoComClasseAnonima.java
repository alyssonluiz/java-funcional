package br.com.digital.innovation.one.aula1;

public class FuncaoComClasseAnonima {
    //Antiga e não recomendavel
    public static void main(String[] args){
        Funcao colocarPrefixoSenhorNaString = new Funcao() {
            @Override
            public String gerar(String valor) {
                return "Sr " + valor;
            }
        };
        System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
    }
}
