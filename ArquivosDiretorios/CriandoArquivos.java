package ArquivosDiretorios;

import java.io.File;
import java.io.IOException;

public class CriandoArquivos {
    public static void main(String[] args) {
        File arquivo = new File("arquivo.txt");
        try {
            boolean isArquivoCriado = arquivo.createNewFile();
            System.out.println(isArquivoCriado);
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
