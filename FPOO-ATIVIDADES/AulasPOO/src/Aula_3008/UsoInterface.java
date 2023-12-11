package Aula_3008;

public class UsoInterface implements InterfacePai{
	//atributos
	public String at1;
	//preciso realizar a sobreescrita de metodos!
	@Override
	public void metodo1() {
		System.out.println("esse e o metodo 1");
	}
	@Override
	public void metodo2() {
		System.out.println("esse e o metodo 2");
	}
	@Override
	public void somar(int x, int y) {
	}
	//método 3 é da própria classe
	public void metodo3() {
		
	}
	
	
}
