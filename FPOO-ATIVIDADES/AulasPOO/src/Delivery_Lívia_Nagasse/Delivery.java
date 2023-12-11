package Delivery_Lívia_Nagasse;

public class Delivery {
	//atributros
	private String nome;
	private String endereco;
	
	//metodo construtor 
	public Delivery() {
		
	}
	public Delivery(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//getters e setters
		public String getNome() {
			return nome;
		}
		public void getNome(String nome) {
			this.nome=nome;
		}
		
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
		//metodos especiais 
		public void exibirMenu() {
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1 - Porcoes");
			System.out.println("2 - Lanches");
			System.out.println("3 - Sobremesas");
			System.out.println("4 - Bebidas");
		}
		public void exibirMenuPorcoes() {
		System.out.println("PORCOES:\n" + 
				"0- nao quero nenhuma porcao\n" +
				"1-batata frita (400g)  20,00\n" +
				"2- mandioca frita (400g) 22,00\n" +
				"3- tilapia frita (400g) 25,00\n"  +
				"4- cebola frita (400g)  18,00\n");
		}
		public void exibirMenuLanches() {
			System.out.println("LANCHES:\n" +
				"0- nao quero nenhum lanche\n"+
				"1- x burguer 28,00\n" +
				"2- x bacon 30,00\n" +
				"3- x salada 25,00\n" +
				"4- x frango 28,00\n" +
				"5- x hamburgao 32,00\n" +
				"6- x tudo 40,00\n" +
				"7- x churrasco 40,00\n" +
				"8- x calabresa 28,00\n" +
				"9- cachorro-quente 26,00\n" +
				"10- misto quente 28,00\n");
		}
		public void exibirMenuSobremesas() {
			System.out.println("SOBREMESAS:\n" + 
				"0- nao quero nenhuma sobremesa\n" +
				"1- Brownie  12,00\n" +
				"2- Pavê  8,00\n " +
				"3- Mousse de limao 6,00\n" + 
				"4- Mousse de maracuja 6,00\n" + 
				"5- Mousse de morango 6,00\n" + 
				"6- Mousse de pudim 8,00\n");
		}
		public void exibirMenuBebidas() {
			System.out.println(
				"BEBIDAS:\n" +
				"0- nao quero nenhuma bebida\n"+
				"1- Agua  2,00\n"+
				"2- Agua  com gás 3,00\n"+
				"3- Refrigerante  (600ml) 5,00\n"+
				"4- Coca-Cola (600ml)  7,00\n" +
				"5- Fanta uva (600ml)  6,00\n"+
				"6- Fanta laranja (600ml)  6,00\n"+
				"7- Fanta maracuja (600ml)  6,00\n"+
				"8- Suco de uva (250ml))  6,00\n" +
				"9- Suco de morango (250ml) 6,00\n" +
				"10- Suco de laranja (250ml) 6,00\n"+
				"11- Suco de limão (250ml) 6,00\n" +
				"12- Suco de marauja (250ml) 6,00\n" +
				"13- Suco de acai (250ml) 6,00\n" 
				
				);			
		}

}
