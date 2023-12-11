package br.org.produtos_educacionais.model;

public class Produto {
	//atributos
	private int ni;
	private String categoria;
	private String nome;
	private float valor;
	
	//construtor padrão
	public Produto() {
		
	}

	
	//construtores getters e setters
	public int getNi() {
		return ni;
	}



	public void setNi(int ni) {
		this.ni = ni;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public float getValor() {
		return valor;
	}



	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
