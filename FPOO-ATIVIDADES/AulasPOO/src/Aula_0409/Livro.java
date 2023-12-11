package Aula_0409;

public class Livro {
	//atributos
	String titulo;
	String autor;
	
	//Construtor padrão
	public Livro() {
		
	}
	public Livro(String titulo, String autor) {
		this.autor  = autor;
		this.titulo = titulo;
	}
	
	//metodos get e set
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
