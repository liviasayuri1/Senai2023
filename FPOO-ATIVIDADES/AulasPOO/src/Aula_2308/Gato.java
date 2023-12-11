package Aula_2308;

public class Gato extends Animal{//herança (extends)
	//atributos
	public String raca;
	public float peso;
	public int idade;
	//método construtor
	public Gato() {
		super();
		System.out.println("acabei de nascer e sou um Gato sem caracteristicas");
	}
	public Gato(String raca) {//metodo construtor com parametros
		super();
		this.raca = raca;
		System.out.println("acabei de nascer e sou um gato da raca" + this.raca);
	}
	public Gato(float peso, int idade) {
		super();
		this.peso = peso;
		this.idade = idade;
		System.out.println("\\ acabei de nascer e sou um gato com " + this.peso + "Kg" + "e" +this.idade
				+ "anos de idade");
	}
	//metodos
	public void som () {
		System.out.println("som da classe Gato");
		super.som(); //som da classe animal
	}
	
	
	
	
	
	
}//fim da classe
