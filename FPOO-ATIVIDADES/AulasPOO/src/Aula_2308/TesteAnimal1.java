package Aula_2308;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteAnimal1 {
	//criei minha lista de animais vazia
	public static void main(String args[]) {	
	
	Scanner entrada = new Scanner(System.in);
	ArrayList<Animal1> animais = new ArrayList<>();
	for(int i = 0; i < 2; i++) {
		System.out.println("Digite o nome do animal" + (i + i) + ":");
		String nome = entrada.nextLine();
		System.out.println("Escolha o tipo de animal" + "(Cao ou Gato) " );
		String tipo = entrada.nextLine();
		Animal1 animal;
		
		if(tipo.equalsIgnoreCase("cachorro")) {
			animal = new Cachorro(nome);
		}else if(tipo.equalsIgnoreCase("Gato")) {
			animal = new Gato1(nome);
		} else {
			System.out.println("Tipo de animal invalido");
			animal = new Animal1(nome);
		}
		animais.add(animal);
		//animais.add(animal);
	}
		for (Animal1 animal : animais) {
			System.out.println("Nome do animal: " + animal.getNome());
	}
  }
	
}