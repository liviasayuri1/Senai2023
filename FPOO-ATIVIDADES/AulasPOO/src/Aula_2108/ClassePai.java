package Aula_2108;

public abstract class ClassePai {
	//atribiutos
	private String senha;
	protected String nome;
	private int idade = 50;
	//construtor
	public ClassePai() {
		System.out.println("chamando construtor padrão da ClassePai" + nome);
	}
	public void metodoImprimir() {
		System.out.println("imprimi na classe pai");
	}
	public void setIdade(int idade) {
		this.idade=idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setSenha(String senha) {
		this.senha=senha;
	}
	public String getSenha() {
		return senha;
	}
}
