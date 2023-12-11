package Atividades_Livia_Nagasse;
import java.util.Scanner;

public class Q2 {
	  public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				int menorNumero = Integer.MAX_VALUE;
				
				System.out.println("Digite uma sequência de números (Digite zero para parar):");
				
				while (true) {
				    int numero = scanner.nextInt();
				    
				    if (numero == 0) {
				        break;
				    }
				    
				    if (numero < menorNumero) {
				        menorNumero = numero;
				    }
				}
				
				if (menorNumero == Integer.MAX_VALUE) {
				    System.out.println("Nenhum número foi digitado.");
				} else {
				    System.out.println("O menor número digitado é: " + menorNumero);
				}
			}
	    }


	}


