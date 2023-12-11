package Atividades_Livia_Nagasse;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int num_aleatorio = (int) (Math.random() * 100) + 1;
			int tentativas;
			int contador = 0;
			System.out.println("Start...");
			
			do {//faça
				System.out.println("Digite um numero de 1 a 30");
				tentativas = entrada.nextInt();
				contador ++;
				if (tentativas < num_aleatorio) {
					System.out.println("Digite um MAIOR");
				}else if(tentativas > num_aleatorio) {
					System.out.println("Digite um MENOR");
				}else {
					System.out.println("Acertou! Parabéns!!!");	
				}
			    } while (tentativas != num_aleatorio);
		}
		System.out.println("Volte sempre!!!");
		}
	}




