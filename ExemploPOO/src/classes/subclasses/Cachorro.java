package classes.subclasses;

import classes.superclasse.Animal;
import interfaces.QuatroPatas;
import interfaces.RespiradoresOxi;

public class Cachorro  extends Animal implements QuatroPatas, RespiradoresOxi{

    private Humano melhorAmigo;
    private String raca;

    public Cachorro(String nome, char genero, Integer idade, Double peso, String color, Humano melhorAmigo, String raca) {
        super(nome, genero, idade, peso, color);
        this.raca = raca;

    }

    public void latir() {
        System.out.println("Latindo");
    }

    public Humano getMelhorAmigo() {
        return melhorAmigo;
    }

    public void setMelhorAmigo(Humano melhorAmigo) {
        this.melhorAmigo = melhorAmigo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }    
    
    public void emitirSom() {
        System.out.println("Latindo");
    }

    @Override
    public void respirar() {
        //Pegando o método da interface
        System.out.println("Ta vivo, ta respirando");
        
    }

    @Override
    public void correr(String destino) {
        //Pegando o método da interface
        System.out.println("O bicho correu para: " + destino);
        
    }
    
}
