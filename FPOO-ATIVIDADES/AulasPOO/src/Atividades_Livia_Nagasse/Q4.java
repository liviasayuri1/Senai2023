package Atividades_Livia_Nagasse;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("digite o n1:");
			int num1 = entrada.nextInt();
			System.out.println("digite o n2:");
			int num2 = entrada.nextInt();
			int mmc= calcularMMC(num1, num2);
			System.out.println("O MMC de " + num1 + " e " + num2 + " é " + mmc);
		}
		
		

	}
	//metodo chamado calcular mmc()
	public static int calcularMMC( int num1, int num2) {
		int maior = Math.max(num1, num2);
		int mmc = maior;	
		//system.out.println("maximo:" + maior);
		while(true) {
			if (mmc % num1 == 0 && mmc % num2 ==0) {
				break;
			}
			mmc = mmc + maior;
		}
		return mmc;
	}
}
