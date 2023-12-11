package Atividades_Livia_Nagasse;

import java.util.Scanner;

public class TesteVaso {

	public static void main(String[] args) {
	  try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Escolha o tipo de vaso:");
		  System.out.println("1 - Vaso Simples");
		  System.out.println("2 - Vaso Decorado");
		  int escolha = scanner.nextInt();
		  scanner.nextLine(); 

		  System.out.print("Informe o material do vaso: ");
		  String material = scanner.nextLine();

		  System.out.print("Informe a cor do vaso: ");
		  String cor = scanner.nextLine();

		  System.out.print("Informe o tamanho do vaso: ");
		  double tamanho1 = scanner.nextDouble();
		  scanner.nextLine(); 

		  if (escolha == 1) {
		      Vaso vaso = new Vaso(material, cor, tamanho1);
		      vaso.exibirInformacoes();
		  } else if (escolha == 2) {
		      System.out.print("Informe o estilo de decoração: ");
		      String estiloDecoracao = scanner.nextLine();
		      VasoDecorado vasoDecorado = new VasoDecorado(material, cor, tamanho1, estiloDecoracao);
		      vasoDecorado.exibirInformacoes();
		  } else {
		      System.out.println("Opção inválida!");
		  }
	}

      
  }

	

}
