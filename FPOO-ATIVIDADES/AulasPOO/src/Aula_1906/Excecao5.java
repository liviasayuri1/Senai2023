package Aula_1906;

public class Excecao5 {

	public static void main(String[] args) {
		String frase = "sesi senai";
		String nova_frase = null;
		try {
			nova_frase = frase.toUpperCase();
		}catch (Exception e) {
			System.out.println("frase inicial esta nula, por isso possui um valor de defaut");
			frase = "frase vazia";
		}
		finally {
			nova_frase = frase.toUpperCase();
		}
		System.out.println("frase antiga: " + frase);
		System.out.println("frase antiga: " + nova_frase);

	}

}
