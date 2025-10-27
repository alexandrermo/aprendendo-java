package ArquivosDiretorios;

import java.io.File;
import java.io.FilenameFilter;

public class ManipulandoDiretorios {
    public static void main(String[] args) {
        String[] conteudos = new File(".").list();
        for (String conteudoItem : conteudos) {
            System.out.println(conteudoItem);
        }

        new File("ArquivosDiretorios/diretorio").mkdir();

        FilenameFilter filtro = (arquivo, nome) -> {
            return nome.contains("a");
        };

        System.out.println("\n");
        conteudos = new File(".").list(filtro);
        for (String conteudoItem : conteudos) {
            System.out.println(conteudoItem);
        }
    }
}
