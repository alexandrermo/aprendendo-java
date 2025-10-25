package ProgramacaoFuncional;

import java.util.ArrayList;

public class AppStream {

    public static void main(String[] args) {
        ArrayList<Livro> livros = criarLivros();

        livros.stream()
                .filter((livroItem) -> livroItem.getTitulo().toLowerCase().contains("a"))
                .filter((livroItem) -> livroItem.getTitulo().toLowerCase().contains("b"))
                .forEach(System.out::println);

        System.out.println("\n");
        livros.parallelStream()
                .filter((livroItem) -> livroItem.getTitulo().toLowerCase().contains("a"))
                .filter((livroItem) -> livroItem.getTitulo().toLowerCase().contains("b"))
                .forEach(System.out::println);

    }

    static ArrayList<Livro> criarLivros() {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Livro2", "Autor2");
        Livro livro3 = new Livro("Livro3 a", "Autor3");
        Livro livro4 = new Livro("Livro4 ab", "Autor4");
        Livro livro5 = new Livro("Livro5 ba", "Autor5");
        Livro livro6 = new Livro("Livro6 c", "Autor6");
        Livro livro7 = new Livro("Livro7 bc", "Autor7");

        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livros.add(livro4);
        livros.add(livro5);
        livros.add(livro6);
        livros.add(livro7);

        return livros;
    }

    static public class Livro {
        private String titulo;
        private String autor;

        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String toString() {
            return titulo + " - " + autor;
        }

        public String getAutor() {
            return autor;
        }

        public String getTitulo() {
            return titulo;
        }
    }

}
