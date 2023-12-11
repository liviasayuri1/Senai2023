package Atividades_Livia_Nagasse;

import java.util.Scanner;

public class TestePadaria {

	public static void main(String[] args) {
		//instanciando objetos
		//Scanner e p1
		Scanner entrada = new Scanner(System.in);
		Pao p1 = new Pao();
		System.out.println("Escolha seu primeiro pao: ");
		p1.setNome(entrada.next());
		System.out.println("Defina o preco: ");
		p1.setPreco(entrada.nextDouble());
		//p2
		Pao p2 = new Pao();
		System.out.println("Escolha seu segundo pao: ");
		p2.setNome(entrada.next());
		System.out.println("Defina o valor: ");
		p2.setPreco(entrada.nextDouble());
		Bolo b1 = new Bolo();
		System.out.println("Escolha seu primeiro bolo: ");
		b1.setNomeB(entrada.nextLine());
		System.out.println("Defina o valor: ");
		b1.setPrecoB(entrada.nextDouble());
		
		Bolo b2 = new Bolo();
		System.out.println("Escolha seu segundo bolo: ");
		b2.setNomeB(entrada.next());
		
		System.out.println("Defina o valor: ");
		b2.setPrecoB(entrada.nextDouble());
		
		Doce d1 = new Doce();
		System.out.println("Escolha seu primeiro doce: ");
		d1.setNome(entrada.next());
		System.out.println("Defina um valor: ");
		d1.setPreco(entrada.nextDouble());
		
		Doce d2 = new Doce();
		System.out.println("Escolha seu segundo doce: ");
		d2.setNome(entrada.next());
		System.out.println("Defina um valor: ");
		d2.setPreco(entrada.nextDouble());
		
		p1.exibirInfoP();
		b1.exibirInfoB();
		d1.exibirInfoD();

		float total = (float) (p1.preco + b1.precoB + d1.preco);
		System.out.println("O total da compra e: " + total);
	}

}
