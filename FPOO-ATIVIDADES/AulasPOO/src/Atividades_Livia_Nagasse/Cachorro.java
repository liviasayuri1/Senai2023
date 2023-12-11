package Atividades_Livia_Nagasse;

public class Cachorro {
	//atributos
	private String nome;
	private float peso;
	private char sexo;
	private int qtdPatas;
	
	//métodos construtores
	
			//sem parametros
	public Cachorro() {
		
	}
			//com parametros
	public Cachorro(String nome, float peso, char sexo, int qtdPatas) {
		this.nome = nome;
		this.peso = peso;
		this.sexo = sexo;
		this.qtdPatas = qtdPatas;
	}
	//métodos getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getQtdPatas() {
		return qtdPatas;
	}
	public void setQtdPatas(int QtdPatas) {
		this.qtdPatas = QtdPatas;
	}
	
	
	
	//métodos especiais 
	public void latir() {
		System.out.println("au au au");
	}
	public void correr() {
		System.out.println("correndooo...");
	}
	public void dormir() {
		System.out.println("dormindo...");
	}
	public void brincar() {
		System.out.println("brincando...");
	}
}
