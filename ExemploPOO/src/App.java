import classes.subclasses.Gato;
import classes.subclasses.Humano;
import classes.subclasses.Passaro;
import classes.subclasses.Salsicha;

public class App {
    
    public static void main(String[] args) {
        Humano kennes = new Humano("Kennes");
        Salsicha salsicha = new Salsicha();
        Gato g1 = new Gato("Nagato", 'M', 1, 3.5, "Black", false, 2);
        System.out.println(g1.getNome());
        g1.setNome("Batatinha");
        Passaro pardal = new Passaro();
        System.out.println(g1.getNome());
        
        g1.emitirSom();
        g1.respirar();
        g1.alimentar(pardal);

    }
}
