package Atividades_Livia_Nagasse;

import java.util.Scanner;

public class TesteParque2 {
	
	public static void main (String[] args) {
		//Scanner e System (permite entrada de dados)
		Scanner entrada = new Scanner (System.in);
		//instancia de objetos
		System.out.println("Informe os dados do brinquedo 1");
		System.out.println("Nome: ");
		String nomeMontanhaRussa = entrada.nextLine(); //pega a linha inteira no String
		System.out.println("Altura Minima: (em metros)");
		double AlturaMinimaMontanhaRussa = entrada.nextDouble();
		System.out.println("Capacidade Máxima");
		int capacidadeMaximaMontanhaRussa = entrada.nextInt();
		//agora estamos instanciando obj da classe BRINQUEDO2
		Brinquedo2 montanhaRussa = new Brinquedo2(nomeMontanhaRussa, AlturaMinimaMontanhaRussa, capacidadeMaximaMontanhaRussa, AlturaMinimaMontanhaRussa); {
			
			//instanciar o 2º Brinquedo 
			
			
			System.out.println("Informe os dados do visitante 1");
			System.out.println("Nome: ");
			entrada.nextLine();
			int nomeVisitante1 = entrada.nextInt();
			System.out.println("Altura: ");
			double alturaVisitante1 = entrada.nextDouble();
			double idadeVisitante1;
			//instancia do objeto visitante1
			Visitante visitante1 = new Visitante (nomeVisitante1, idadeVisitante1, alturaVisitante1);
			System.out.println("Informações do brinquedo: ");
			montanhaRussa.exibirinformacoes();
			
			System.out.println("Informações do visitante 1: ");
			visitante1.exibirInformacoes();
			//vamos verificar se o visitante pode ou nao andar no brinquedo
			System.out.println("Pode andar na montanhaRussa? " + (visitante1.podeAndarNoBrinquedo()));
		}
	}
}
