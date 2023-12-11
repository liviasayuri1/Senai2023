package Delivery_Lívia_Nagasse;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TesteDelivery {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//instancia de objetos
		Delivery d1 = new Delivery("Delivery", "Rua das rosas");
		Cliente c1 = new Cliente();
		Pedido p1 = new Pedido(113, 40, null);
		ItemPedido ip1 = new ItemPedido();
		Entrega e1 = new Entrega();
		ArrayList <ItemPedido> cardapio = new ArrayList();
		

		
		//
		System.out.println("Seja bem vindo ao delivery da Livia!!!");
		//informações do cliente
		System.out.println("Informe seu nome: ");
		c1.setNome(entrada.nextLine());
		System.out.println("Informe seu endereco: ");
		c1.setEndereco(entrada.nextLine());
		System.out.println("Informe seu telefone: ");
		c1.setTelefone(entrada.nextInt());
		
		
		//um switch dentro do outro
		int opCard;
		d1.exibirMenu();
		opCard = entrada.nextInt();
		
	
			System.out.println("Escolha uma das porcoes disponiveis: ");
			
			switch(opCard) {
			
			case 1:
				d1.exibirMenuPorcoes();
				//opcoes de porcoes 
				int escolha = entrada.nextInt();
				switch (escolha) {
				case 1:
					System.out.println("voce escolheu batata-frita");
					break;
				case 2:
					System.out.println("voce escolheu mandioca frita");
					break;
				case 3:
					System.out.println("voce escolheu tilápia frita");
					break;
				case 4:
					System.out.println("voce escolheu cebola frita");
					break;
				}
			break;
					
			case 2: 
				d1.exibirMenuLanches();
				
			break;
			case 3: 
			System.out.println("Voce escolheu tilapia frita!");
			break;
			case 4: 
			System.out.println("Voce escolheu cebola frita!");
			break;
			default: 
			System.out.println("Voce nao escolheu nenhuma opcao. ");
			break;
			} 
			
			
			//OPÇÕES DE LANCHES 
			System.out.println("Escolha um dos lanches disponiveis: ");
			//d1.exibirMenuLanches();
			d1.exibirMenuLanches();
			opCard = entrada.nextInt();
			switch(opCard) {
			case 1:
				System.out.println("voce escolheu x-burguer");
				break;
			case 2:
				System.out.println("voce escolheu x-bacon");
				break;
			case 3:
				System.out.println("voce escolheu x-salada");
				break;
			case 4:
				System.out.println("voce escolheu x-frango");
				break;
			case 5:
				System.out.println("voce escolheu x-hamburgao");
				break;
			case 6:
				System.out.println("voce escolheu x-tudo");
				break;
			case 7:
				System.out.println("voce escolheu x-churrasco");
				break;
			case 8:
				System.out.println("voce escolheu x-calabresa");
				break;
			case 9:
				System.out.println("voce escolheu cachorro-quente");
				break;
			case 10:
				System.out.println("voce escolheu misto quente");
				break;
			default: 
				System.out.println("Voce nao escolheu nenhuma opcao. ");
				break;
		}

			//OPÇÕES DE SOBREMESA
			System.out.println("Escolha uma das sobremesas disponiveis: ");
			d1.exibirMenuSobremesas();
			opCard = entrada.nextInt();
			switch(opCard) {
			case 1:
				System.out.println("voce escolheu Brownie");
				break;
			case 2:
				System.out.println("voce escolheu Pavê");
				break;
			case 3:
				System.out.println("voce escolheu Mousse de limao");
				break;
			case 4:
				System.out.println("voce escolheu Mousse de maracuja");
				break;
			case 5:
				System.out.println("voce escolheu Mousse de mmorango");
				break;
			case 6:
				System.out.println("voce escolheu pudim");
				break;
			default: 
				System.out.println("Voce nao escolheu nenhuma opcao. ");
				break;
		}

			
			//OPÇÕES DE BEBIDAS
			System.out.println("Escolha uma das bebidas disponiveis: ");
			d1.exibirMenuBebidas();
			opCard = entrada.nextInt();
			switch(opCard) {
			case 1:
				System.out.println("voce escolheu agua");
				break;
			case 2:
				System.out.println("voce escolheu agua com gas");
				break;
			case 3:
				System.out.println("voce escolheu refrigerante");
				break;
			case 4:
				System.out.println("voce escolheu Coca-Cola");
				break;
			case 5:
				System.out.println("voce escolheu Fanta uva");
				break;
			case 6:
				System.out.println("voce escolheu Fanta laranja");
				break;
			case 7:
				System.out.println("voce escolheu Fanta maracuja");
				break;
			case 8:
				System.out.println("voce escolheu suco uva");
				break;
			case 9:
				System.out.println("voce escolheu suco morango");
				break;
			case 10:
				System.out.println("voce escolheu suco laranja");
				break;
			case 11:
				System.out.println("voce escolheu suco limao");
				break;
			case 12:
				System.out.println("voce escolheu suco maracuja");
				break;
			case 13:
				System.out.println("voce escolheu suco acai");
				break;
			default: 
				System.out.println("Voce nao escolheu nenhuma opcao. ");
				break;
			}
			//informações pedido
			System.out.println("o numero do seu pedido e:  " + p1.getNumeroPedido());
			System.out.println("O tempo previsto para a entrega e de " + p1.getTempoEntrega() + " minutos");
			//informações entrega
			System.out.println("");
		}

}

