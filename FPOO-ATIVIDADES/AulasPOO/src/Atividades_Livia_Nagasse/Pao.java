package Atividades_Livia_Nagasse;

public class Pao extends ProdutoPadaria{
	//atributos
	public String nome;
	public double preco;
	//metodos
	public Pao() {
		
	}
	public Pao(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	//getters e setters
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
	
	public void exibirInfoP() {
		System.out.println("O pao escolhido foi " + getNome() + " com o preco " + getPreco());
	}
	
	//acoes
	//public void preparandoMassa() {
	//	System.out.println("a massa esta sendo preparada...");
	//}
	//public void assandoMassa() {
	//	System.out.println("a massa esta assando...");
//	}

	
	//pedidos
	//if(nome = "PaoFrances") {
	//	System.out.println("Voce escolher Pao Frances" + "R$" + preco);
	//}else if (nomeP = "Pao sirio") {
	//	System.out.println("voce escolheu Pao sirio" + "R$" + preco);
	//}else {
	//	System.out.println("Pedido invalido");
	//}
}


