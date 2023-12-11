package Atividades_Livia_Nagasse;

public class Sala extends Comodo{
	// Atributos
    private boolean temTv;
    private String nome;

    // Construtor
    public Sala() {
    	
    }
    public Sala(String nome, boolean temTv) {
        this.temTv = temTv;
        this.nome = nome;
    }

    // Getters
    public boolean getTemTv() {
        return temTv;
    }
    
    public String getNome() {
        return nome;
    }
}
