package GenericWildcards;

import java.util.List;

public class LowerBoundedWildcards {
    public static void imprimirGatosOrSuper(List<? super Gato> gatosOuSuper) {
        System.out.println(gatosOuSuper);
    }

    public static void main(String[] args) {
        List<Gato> listaGatos = List.of(new Gato(), new Gato());
        List<Animal> listaAnimais = List.of(new Animal(), new Animal());

        imprimirGatosOrSuper(listaGatos);
        imprimirGatosOrSuper(listaAnimais);

        // List<Cachorro> listaCachorros = List.of(new Cachorro(), new Cachorro());
        // imprimirGatosOrSuper(listaCachorros);
    }
}
