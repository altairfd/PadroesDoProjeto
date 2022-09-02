package classes.subclasses;
import classes.superclasse.Animal;
import interfaces.Comida;
import interfaces.QuatroPatas;
import interfaces.RespiradoresOxi;

public class Gato extends Animal implements QuatroPatas, RespiradoresOxi{

    private Boolean estaMalHumorado;

    private int energia;

    public Gato(){}

    public Gato(String nome, char genero, 
        Integer idade, Double peso, String color,
         Boolean estaMalHumorado, int energia) {
        super(nome, genero, idade, peso, color);
        this.estaMalHumorado = estaMalHumorado;
        this.energia = energia;
    }
    
    public void miar(){
        System.out.println("Mrrrrow! meeaOOOW… RaaaAAAAH!");
    }

    public Boolean getEstaMalHumorado() {
        return estaMalHumorado;
    }

    public void setEstaMalHumorado(Boolean estaMalHumorado) {
        this.estaMalHumorado = estaMalHumorado;
    }

    public void emitirSom() {
        System.out.println("miadno");
    }

    public void alimentar(Comida c) {
        this.energia += c.getNutriente();
        System.out.println(this.energia);
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

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
}
