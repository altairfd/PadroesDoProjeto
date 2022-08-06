public class App {
    public static void main(String[] args) throws Exception {
        Animal gatinho = new Animal("Chester", 'M', 1, 1.5, "Zebrado");
        System.out.println(gatinho.getNome());
        gatinho.setNome("Tenente Acelora");
        System.out.println(gatinho.getNome());
        
        
    }
}
