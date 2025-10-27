package ArquivosDiretorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopiandoArquivos {
    public static void main(String[] args) {
        Path arquivoPath = Paths.get("ArquivosDiretorios/origem/lorem-ipsum.txt");
        Path novoArquivoPath = Paths.get("ArquivosDiretorios/destino/lorem-ipsum.txt");

        try {
            Files.copy(arquivoPath, novoArquivoPath);
        } catch (IOException error) {
            error.printStackTrace();
        }

        try {
            Files.copy(arquivoPath, novoArquivoPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException error) {
            error.printStackTrace();
        }
    }
}
