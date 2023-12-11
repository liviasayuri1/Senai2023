package Aula_1906;

import java.util.Scanner;

public class Excecao3 {
	public static final String minha_senha = "123"; //final vira constante
	
	public static void main (String[] args) {
		boolean senha_correta = false;
		while(!senha_correta) {
		try {	
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite a sua senha");
			String senha_digitada = entrada.nextLine();
			if(!senha_digitada.equals(minha_senha)) {
				throw new Exception("senha invalida!");	
			}
		System.out.println("senha correta...");
		senha_correta = true;
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	}
}