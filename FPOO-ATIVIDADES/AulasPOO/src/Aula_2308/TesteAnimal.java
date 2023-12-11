package Aula_2308;

public class TesteAnimal {
	private static Gato gato1;

	public static void main (String[] args) {
		//instancia de objetos
		Animal ani1 = new Animal();
		ani1.nome = "Pica pau";
		System.out.println("Animal criado: " + ani1.nome);
		//instancia de objeto da classe gato
		System.out.println("----------Fim Animal----------");
		
		System.out.println("----------Gato 1----------");
		Gato gato1 = new Gato();
		gato1.nome ="Serjao Barranteiro";
		System.out.println("Nome: " + gato1.nome);
		gato1.brincar();
		System.out.println("----------Fim Gato1----------");
		
		System.out.println("----------Gato 2----------");
		Gato gato2 = new Gato("Persa");
		gato2.som();
		System.out.println("----------Fim Gato2----------");
		
		System.out.println("----------Gato 3----------");
		Gato gato3 = new Gato(2.5f, 1);
	}
}
