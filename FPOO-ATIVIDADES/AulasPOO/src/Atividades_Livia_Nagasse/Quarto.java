package Atividades_Livia_Nagasse;

public class Quarto extends Comodo{
	// Atributos
    private int numeroCamas;

    // Construtor
    public Quarto() {
    	
    }
    public Quarto(int numeroCamas, String nomeQuarto) {
        this.numeroCamas = numeroCamas;
        
    }

    //getters e setters
    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
}
