package GenericWildcards;

import java.util.List;

public class UpperBoundedWildcards {
    public static void imprimirListaAnimais(List<? extends Animal> animais) {
        for (Animal animalItem : animais) {
            System.out.println(animalItem);
        }
    }

    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        List<Animal> animais = List.of(gato, cachorro);
        System.out.println("Lista de animais:");
        imprimirListaAnimais(animais);

        List<Gato> listaGatos = List.of(new Gato(), new Gato());
        System.out.println("\nLista de gatos:");
        imprimirListaAnimais(listaGatos);

        List<Cachorro> listaCachorros = List.of(new Cachorro(), new Cachorro());
        System.out.println("\nLista de cachorros:");
        imprimirListaAnimais(listaCachorros);
    }
}