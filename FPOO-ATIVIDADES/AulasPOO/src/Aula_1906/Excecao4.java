package Aula_1906;

public class Excecao4 {

	public static void main(String[] args) {
		int vet[] = {10, 20, 30, 40};
		System.out.println("Oi 1");
		try {
			int v = vet[4];
			System.out.println("ultmo elemento e: " + v);
		}catch (Exception e) {
			System.out.println("nao exceda ao tamanho do array " + e);
		}
		System.out.println("Oi 2");
		System.out.println("Oi 3");

	}

}
