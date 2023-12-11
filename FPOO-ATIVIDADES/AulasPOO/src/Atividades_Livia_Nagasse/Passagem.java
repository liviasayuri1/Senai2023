package Atividades_Livia_Nagasse;


public class Passagem {
//atributos
	private Voo voo;
	private Passageiro passageiro;
	private double precoTotal;
	//construtor
	public  Passagem() {

	}
	public Passagem(Voo voo, Passageiro passageiro, double precoTotal) {
		this.voo = voo;
		this.passageiro = passageiro;
		this.precoTotal = precoTotal;
	}
	//metodos get e set
	public Voo getVoo() {
		return voo;
	}
	public  void setVoo(Voo voo) {
		this.voo = voo;
	}
	
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	//metodos specials
	public void toStringParaguai() {
		System.out.println("VOO");
		System.out.println(voo.getNumeroVoo());
		System.out.println(voo.getOrigem());
		System.out.println(voo.getDestino());
		System.out.println(voo.getPreco());
		System.out.println(voo.getDataIda());
		System.out.println(voo.getDataVolta());
		System.out.println("PASSAGEIRO");
		System.out.println(passageiro.getNome());
		System.out.println(passageiro.getSobreNome());
		System.out.println(passageiro.getEmail());
		System.out.println("PRECO TOTAL");
		System.out.println(precoTotal);
		
	}
	
}