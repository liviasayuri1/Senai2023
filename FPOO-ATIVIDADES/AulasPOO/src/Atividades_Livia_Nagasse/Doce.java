package Atividades_Livia_Nagasse;

public class Doce {
	public String nome;
	public double preco;
	//metodos
		public Doce() {
			
		}
		public void Doce(String nome, double preco) {
			this.nome = nome;
			this.preco = preco;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		public void exibirInfoD() {
			System.out.println("O doce escolhido foi " + getNome() + " com o preco " + getPreco());
		}
		
		//public void preparandoDoce() {
		//	System.out.println("o doce esta sendo preparado...");
		//}
		//public void assandoDoce() {
			//System.out.println("o doce esta sendo assado...");
		//}
}
