package classes.subclasses;

import classes.superclasse.Animal;

public class Humano {
    private String nome;

    public Humano(String nome) {
        this.nome = nome;
    }

    public void darCarinho(Animal animal) {
        System.out.println("Fazeno carinho: " + animal.getNome());
        animal.emitirSom();
    }
}
