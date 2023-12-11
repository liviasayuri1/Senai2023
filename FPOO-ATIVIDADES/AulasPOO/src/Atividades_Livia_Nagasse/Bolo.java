package Atividades_Livia_Nagasse;

public class Bolo {
	public String nomeB;
	public double precoB;
	//metodos
		public Bolo() {
			
		}
		public Bolo(String nome, double preco) {
			this.nomeB = nome;
			this.precoB = preco;
		}
		//getters e setters
		public String getNomeB() {
			return nomeB;
		}
		public void setNomeB(String nomeB) {
			this.nomeB = nomeB;
		}
		public double getPrecoB() {
			return precoB;
		}
		public void setPrecoB(double precoB) {
			this.precoB = precoB;
		}
		public void preparandoBolo() {
			System.out.println("o bolo esta sendo preparado...");
		}
		public void assandoBolo() {
			System.out.println("o bolo esta sendo assado...");
		}
		public void exibirInfoB() {
			System.out.println("O bolo escolhido foi " + getNomeB() + " com o preco " + getPrecoB());
		}
}
