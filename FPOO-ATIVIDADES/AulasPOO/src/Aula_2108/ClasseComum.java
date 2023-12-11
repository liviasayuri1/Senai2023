package Aula_2108;

public class ClasseComum {
	//atributos
	public int numero = 10;
	public int idade = 50;
	//metodo construtor
	public ClasseComum () {
		System.out.println("acabei de nascer! fui instanciado!");
	}
	public ClasseComum(int id) {
		super();
		this.idade = id;
	}
	//metodos
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public int getIdade() {
		return idade;
	}
	public int setIdade(int idade) {
		return this.idade=idade;
	}
	
}
