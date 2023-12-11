package Aula_1406;

import java.util.Scanner;

public class ExArray {

	public static void main(String[] args) {
		//instanciar ("criar") o vetor de notas sem os valores
		int[] notas = new int [2];
		int i;
		//instanciar ("criar") um objeto para pegar os valores digitados
		Scanner entrada = new Scanner(System.in);
		//receber as duas notas que estão vindo do obj de entrada
		for(i = 0; i < 2; i ++) {
			System.out.printf("\nEntre com o numero" + (i+1), ":");
			notas[i] = entrada.nextInt();
		}
		//exibir(ler) os valores que estão no vetor
		for(i = 0; i < 2; i++) {
			System.out.printf("numero %d-->nota armazenada: %d", (i+1), notas[i]);
		}
		//exibir a média simples
		for(i = 0; i < 2; i++) {
			
		}

	}

}
