package Aula_2308;

public class Animal1 {
	//Atributos
	private String nome;
	//metodo construtor
	public Animal1(String nome) {
		this.nome = nome;
	}
	public void emitirSom() {
		System.out.println("O animal esta fazendo um som");
	}
	
	/*public void mover() {
		System.out.println("O animal esta se movendo");
	}*/
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
