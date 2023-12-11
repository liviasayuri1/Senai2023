package Aula_1906;

import java.util.Scanner;

public class Excessao2 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println("digite o numero 1:");
			n1 = entrada.nextInt();
			System.out.println("digte o numero 2");
			n2 = entrada.nextInt();
			System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
		} catch (Exception e) {
			System.out.println("ERRO: digite um numero inteiro!!!");
		}


	}

}
