package ProgramacaoFuncional;

public class AppLambda {

    public static void main(String[] args) {
        Saudacao saudacao = (nome) -> {
            System.out.println("Olá, " + nome);
        };

        saudacao.saudar("Alê");
    }
}
