package Atividades_Livia_Nagasse;

import java.util.Scanner;

public class TesteCasa {

	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        // Instanciando objeto

	        System.out.println("Informe a cor da casa:");
	        String corCasa = scanner.nextLine();

	        System.out.println("Informe o valor da casa:");
	        float precoCasa = scanner.nextFloat();

	        System.out.println("Informe a metragem da casa:");
	        float metragemCasa = scanner.nextFloat();

	        // Informações sobre o quarto
	        System.out.println("\nInforme o nome do quarto:");
	        scanner.nextLine(); // Limpa o buffer
	        String nomeQuarto = scanner.nextLine();

	        System.out.println("Informe o número de camas no quarto:");
	        int numeroCamas = scanner.nextInt();

	        Quarto quarto = new Quarto(numeroCamas, nomeQuarto);

	        // Informações sobre a sala
	        System.out.println("\nInforme o nome da sala:");
	        scanner.nextLine(); // Limpa o buffer
	        String nomeSala = scanner.nextLine();

	        System.out.println("A sala tem TV? (true/false):");
	        boolean temTv = scanner.nextBoolean();

	        Sala sala = new Sala(nomeSala, temTv);

	        Casa minhaCasa = new Casa(corCasa, precoCasa, metragemCasa, quarto, sala);

	        // detalhes da casa
	        System.out.println("\nDetalhes da Casa:");
	        minhaCasa.mostrarDetalhes();

	        // número de camas no quarto
	        System.out.println("\nNúmero de Camas no Quarto: " + quarto.getNumeroCamas());

	        // a sala tem TV?
	        System.out.println("\nA Sala tem TV? " + sala.getTemTv());

	        // informações sobre o cômodo
	        System.out.println("\nInforme o nome do cômodo:");
	        scanner.nextLine(); // Limpa o buffer
	        String nomeComodo = scanner.nextLine();

	        Comodo comodo = new Comodo(nomeComodo);

	        System.out.println("\nNome do Cômodo: " + comodo.getNome());

	        scanner.close();
	    }


}
