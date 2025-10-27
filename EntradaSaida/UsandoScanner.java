package EntradaSaida;

import java.util.Scanner;

public class UsandoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome sobrenome?");
        String nome = scanner.next();
        String sobrenome = scanner.next();

        System.out.printf("Olá, %s %s\n", nome, sobrenome);

        scanner.close();
    }

}
