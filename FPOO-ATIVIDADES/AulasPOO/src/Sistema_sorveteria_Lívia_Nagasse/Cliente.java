package Sistema_sorveteria_Lívia_Nagasse;

public class Cliente extends Pessoa{
	//atributos 
	private int senha;
	
	
	//construtores
	public Cliente() {
		
	}
	public Cliente(String nome, int idade, char sexo, double cpf, int senha) {
		super.setNome(nome);
		super.setIdade(idade);
		super.setSexo(sexo);
		super.setCpf(cpf);
		this.senha = senha;
	}
	
	//getters e setters
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}	
	
}
