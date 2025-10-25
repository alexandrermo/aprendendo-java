package ProgramacaoFuncional;

public class AppReferenciaMetodo {

    public static void main(String[] args) {
        Saudacao saudacao = System.out::println;

        saudacao.saudar("Alê");
    }
}
