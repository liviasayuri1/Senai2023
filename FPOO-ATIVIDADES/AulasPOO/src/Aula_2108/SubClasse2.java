package Aula_2108;

public class SubClasse2 extends SubClasse1{
	public String nome2; //nome desta Classe!
	//metodo construtor
	public SubClasse2() {
		System.out.println("senha vista pela sua subClasse2 " + getSenha());
		System.out.println("nome visto pela sua subClasse2 " + nome);
		
	}
	public String getNome() {
		return nome2;
	}
	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}
}
