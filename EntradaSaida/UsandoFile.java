package EntradaSaida;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UsandoFile {
    public static void main(String[] args) {
        File arquivo = new File("EntradaSaida/lorem-ipsum.txt");

        try {
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));

            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

            leitor.close();
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

}
