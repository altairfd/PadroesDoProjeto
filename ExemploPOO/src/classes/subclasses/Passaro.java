package classes.subclasses;
import java.util.Date;
import interfaces.Comida;

public class Passaro implements Comida {

    private int nutriente = 20;
    private String cor = "Anu-branco";
    private Date dataValidade = new Date(2022, 8, 30);

    @Override
    public int getNutriente() {
        return nutriente;
    }

    public void setNutriente(int nutriente) {
        this.nutriente = nutriente;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    
}
