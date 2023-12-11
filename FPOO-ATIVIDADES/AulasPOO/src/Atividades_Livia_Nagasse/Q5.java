package Atividades_Livia_Nagasse;

import java.util.Scanner;

public class Q5 {


    private static double num1;
	private static double num2;
	private static double num32;

	public static void main(String[] args) {
		
         try (Scanner entrada = new Scanner (System.in)) {
			int operacao;

			 do {

			     exibirMenu();

			     operacao = entrada.nextInt();

			     switch (operacao) {

			     case 1:

			         System.out.println("adicao");

			         System.out.println("digite o 1º numero");

			        num1 = entrada.nextDouble();    

			        System.out.println("digite o 2º numero");

			        num2 = entrada.nextDouble();
			        
			        num32 = num1 + num2;

			        break;

			     case 2:

			         System.out.println("subtracao");

			         break;

			     case 3:

			         System.out.println("divisao");

			      break;

			     case 4:

			         System.out.println("multiplicacao");

			      break;

			     default:

			         System.out.println("escolha as operacao de 1 a 4");

			         break;

			     }System.out.println();

			 }while(operacao != 0);
		}

}

    public static void exibirMenu() {

        System.out.println("selecione uma opcao:");

        System.out.println("1-adicao");

        System.out.println("2-subtracao");

        System.out.println("3-divisao");

        System.out.println("4-multiplicacao");

        System.out.println("0-SAIR");

        

    }

}