package Atividades_Livia_Nagasse;

public class Passageiro {
	//atributos
	private String nome;
	private String sobreNome;
	private String email;
	//construtores
	public Passageiro () {
		
	}
	public Passageiro(String nome, String sobreNome, String email) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.email = email;
	}
	//metodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}


