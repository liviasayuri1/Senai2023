package Atividades_Livia_Nagasse;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteVaso2 {//ac2ce0ss5@adm

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
        ArrayList<Vaso> vasos = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            System.out.println("Vaso " + i);
            System.out.print("Informe o material do vaso: ");
            String material = scanner.nextLine();

            System.out.print("Informe a cor do vaso: ");
            String cor = scanner.nextLine();

            System.out.print("Informe a altura do vaso (em cm): ");
            double altura = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.println("Escolha o tipo de vaso:");
            System.out.println("1 - Vaso Simples");
            System.out.println("2 - Vaso Decorado");
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            if (escolha == 1) {
                Vaso vaso = new Vaso(material, cor, altura);
                vasos.add(vaso);
            } else if (escolha == 2) {
                System.out.print("Informe o estilo de decoracao: ");
                String estiloDecoracao = scanner.nextLine();
                VasoDecorado vasoDecorado = new VasoDecorado(material, cor, altura, estiloDecoracao);
                vasos.add(vasoDecorado);
            } else {
                System.out.println("Opção inválida! Vaso não criado.");
            }
        }

        for (Vaso vaso : vasos) {
            vaso.exibirInformacoes();
            System.out.println();
        }

        
	}

}
