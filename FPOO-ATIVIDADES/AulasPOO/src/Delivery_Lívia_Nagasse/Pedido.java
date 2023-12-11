package Delivery_Lívia_Nagasse; //tem que ter arraylist

public class Pedido {
	//atributos
	private int numeroPedido;
	private int tempoEntrega;
	private ItemPedido itens;

	
	//metodo construtor 
	public Pedido() {
		
	}
	public Pedido (int numeroPedido, int tempoEntrega, ItemPedido itens) {
		this.numeroPedido = numeroPedido;
		this.tempoEntrega = tempoEntrega;
		this.itens = itens;
	}
	
	//getters e setters
	public int getNumeroPedido() {
		return numeroPedido;
	}
	
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	public int getTempoEntrega() {
		return tempoEntrega;
	}
	
	public void setTempoEntrega(int tempoEntrega) {
		this.tempoEntrega = tempoEntrega;
	}
	
	public ItemPedido itens() {
		return itens;
	}
	
	public void setItens(ItemPedido itens) {
		this.itens = itens;
	}
}
