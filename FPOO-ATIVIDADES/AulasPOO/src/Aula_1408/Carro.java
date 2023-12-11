package Aula_1408;

public class Carro {
	//atributos
	public String modelo;
	private float potencia;
	public boolean parado;
	public int ano;
	//construtor padrão default
	public Carro() {
		System.out.println("acabei de nascer");
	}
	public Carro(String mod,float pot) {
		modelo = mod;
		potencia = pot;
		
	}
	
	//metodos getters e setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String m) {
		modelo = m;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia (float p) {
		potencia = p;
	}
	
	//métpodos especiais (dá trabalho-lógica)
	public boolean getAcelerar() {
		if (parado == true) {
			System.out.println("sem movimento");
		}else {
			System.out.println("andando");
		}
		return parado;
	}
	
	public boolean getFrear() {
		if(parado==true) {
			System.out.println("sem movimento . . . acionei o freio");
		}else {
			System.out.println("esta em movimento...socorro!");
		}
		return parado;
	}
	
	public boolean isParado() {//muda o estado do carro
		return parado;
	}
	public void setParado(boolean pa) {
		parado=pa;
	}
}
