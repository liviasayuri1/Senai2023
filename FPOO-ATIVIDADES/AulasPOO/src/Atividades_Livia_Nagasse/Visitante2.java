package Atividades_Livia_Nagasse;

public class Visitante2 {
	//atributos
	private String nome;
	private int idade;
	private double altura;
	
	//construtor
	public Visitante2() {
		
	}
	public Visitante2(String n, int idad, double altu) {
		this.nome = n;
		this.idade = idad;
		this.altura = altu;
	}
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getidade() {
		return idade;
	}
	public void setidade(int idade) {
		this.idade = idade;
	}
	public double getaltura() {
		return altura;
	}
	public void setaltura(double altura) {
		this.altura = altura;
	}
	
	//método especial
	public boolean podeAndarNoBrinquedo() {
		if(idade >= 10 || altura > 1.2) {
			return true;
		}else {
			return false;
		}
	}
	public void exibirInformacoes() {
		System.out.println("Visitante: " + nome);
		System.out.println("Idade: " + idade + "anos");
		System.out.println("altura: " + altura + "m");
	}
}
