package Atividades_Livia_Nagasse;
import java.util.Scanner;
public class Q1 {

		    public static void main(String[] args) {
		        try (Scanner Scanner = new Scanner(System.in)) {
					int soma = 0;
					
					System.out.println("Digite uma sequência de números positivos (Digite um número negativo ou zero para parar):");
					
					while (true) {
					    int numero = Scanner.nextInt();
					    
					    if (numero <= 0) {
					        break;
					    }
					    
					    soma = soma + numero;
					}
					
					System.out.println("A soma dos números positivos digitados é: " + soma);
				}
		    }
		

	}


