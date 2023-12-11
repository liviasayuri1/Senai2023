package Aula_2108;

public class SuperClasse {
	//atributos
	protected int a = 1234;
	protected int b = 6789;
	//metodo construtor
	SuperClasse(){
		
	}
	//metodos
	public int getA() {
		return a;
	}
	
	public int setA(int a) {
		return this.a=a;
	}
	public int getB() {
		return b;
	}
	public int setB(int b) {
		return this.b=b;
	}
	//método especial
	public String toString() {
		return "Você chamou o método to String da SuperClasse";
	}
	
}
