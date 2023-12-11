package Aula_1206;

public class Cardapio {

	public static void main(String[] args) {
		int opcao = 3;
		switch (opcao) {
		case 1:
			System.out.println("Lanche");
			break;
		
		case 2:
			System.out.println("Bebida");
			break;
			
		case 3: 
			System.out.println("Sobremesa");
			
		default :
			System.out.println("não válido");
			break;
		}

	}

}
