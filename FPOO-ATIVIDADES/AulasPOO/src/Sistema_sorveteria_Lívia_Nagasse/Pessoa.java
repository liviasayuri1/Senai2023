package Sistema_sorveteria_Lívia_Nagasse;

public class Pessoa {
	//atributos
	private String nome;
	private int idade;
	private char sexo;
	private double cpf;
	
	//construtores 
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade, char sexo, double cpf) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
	}

	
	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	
}
