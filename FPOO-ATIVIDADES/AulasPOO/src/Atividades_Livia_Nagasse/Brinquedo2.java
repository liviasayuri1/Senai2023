package Atividades_Livia_Nagasse;

public class Brinquedo2 {
	//atributos
	private String nome;
	private double AlturaMinima;
	private int capacidadeMaxima;
	
	//método construtor
	public Brinquedo2() {
		
	}
	public Brinquedo2(String nome, double alturaMinima, int capacidadeMaxima, double AlturaMinima) {
		this.nome = nome;
		this.AlturaMinima = AlturaMinima;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	//metodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getalturaMinima() {
		return AlturaMinima;
	}
	public void setalturaMinima(double AlturaMinima) {
		this.AlturaMinima = AlturaMinima;
	}
	public int getcapacidadeMaxima() {
		return capacidadeMaxima;
	}
	public void setcapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	//metodos especiais
	public void exibirinformacoes() {
		System.out.println("Brinquedo: " + nome);
		System.out.println("Altura Minima: " + AlturaMinima);
		System.out.println("Capacidade Maxima: " + capacidadeMaxima + "pessoas");
	}
	
	
	
}