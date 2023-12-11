package Aula_2308;

public class SobreCarga {
	//métodos
	//não esta ocorrendo sobrecarga de métodos, pois os tipos dos métodos são DIFERENTES
	public int soma (int a, int b) {
		return a + b;
	}
	public double soma(double a, double b) {
		return a + b;
	}
	public String soma (String a, String b) {
		return a + b;
	}
	public void soma (int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
}
