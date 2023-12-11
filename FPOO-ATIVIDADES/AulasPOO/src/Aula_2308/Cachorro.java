package Aula_2308;

public class Cachorro extends Animal1{
	//Atributos
	public String nome;
	//metodo construtor 
	public Cachorro (String nome) {
		super(nome);//pegtando atributo nome da super classe Animal1
	}
	@Override //sobreescrita de método
	public void emitirSom() {
		System.out.println("O cachorro esta latindo...");
	}
	
}
