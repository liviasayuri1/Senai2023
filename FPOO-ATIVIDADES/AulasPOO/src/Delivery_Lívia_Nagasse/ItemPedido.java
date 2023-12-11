package Delivery_Lívia_Nagasse;

public class ItemPedido {
	//atributos
	private String nome;
	private double valor;
	private int calorias;
	
	//metodos construtores
	public ItemPedido() {
		
	}
	public ItemPedido(String nome, double valor, int calorias) {
		this.nome = nome;
		this.valor = valor;
		this.calorias = calorias;
	}
	
	//getters e setters 
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int calorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
