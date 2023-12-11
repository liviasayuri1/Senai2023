package Sistema_sorveteria_Lívia_Nagasse;

public class Sorvete {
	//atributos
	private String sabor;
	private String acompanhamento;
	private double preco;
	
	//construtores
	public Sorvete() {
		
	}
	
	public Sorvete(String sabor, String acompanhamento, double preco) {
		this.sabor = sabor;
		this.acompanhamento = acompanhamento;
		this.preco = preco;
	}
	//métodos getters e setters
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getAcompanhamento() {
		return acompanhamento;
	}
	public void setAcompanhamento(String acompanhamento) {
		this.acompanhamento = acompanhamento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	
	
	
}
