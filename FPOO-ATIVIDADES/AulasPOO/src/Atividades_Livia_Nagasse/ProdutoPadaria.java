package Atividades_Livia_Nagasse;

public class ProdutoPadaria implements Produto{
	//atributos
	public String nome;
	public double preco;
	//construtores
	public ProdutoPadaria() {
	}
	
	public ProdutoPadaria(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
	}
	//implementos 
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public double getPreco() {
		return preco;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}
	




}
