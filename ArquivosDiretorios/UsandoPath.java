package ArquivosDiretorios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsandoPath {
    public static void main(String[] args) {
        Path arquivoPath = Paths.get("ArquivosDiretorios/arquivo.txt");

        System.out.println(arquivoPath.getParent());
        System.out.println(arquivoPath.getRoot());
        System.out.println(arquivoPath.getFileName());

        try {
            Files.deleteIfExists(arquivoPath);
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

}
