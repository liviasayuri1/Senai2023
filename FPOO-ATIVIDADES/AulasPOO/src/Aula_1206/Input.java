package Aula_1206;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		//instancia ("criar") de objeto objin
		Scanner objin = new Scanner (System.in);
		System.out.println("Digite o valor de a:");
		int a = objin.nextInt();
		System.out.println("Digite o valor de b:");
		int b = objin.nextInt();
		if (a > b) {
			System.out.printf("valor de a:%d %d\n" , a,b);
			System.out.println("valor de a:" + a + " " + b);
		}else
			System.out.printf("%d\n" + b);
		}
		

	}


