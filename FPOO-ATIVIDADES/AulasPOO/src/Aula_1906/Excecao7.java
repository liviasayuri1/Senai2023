package Aula_1906;
import java.util.Scanner;

public class Excecao7 {

	public static void main(String[] args) {
		String cpf; //123.456.789-00 valido!
		Scanner entrada = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("digite o cpf");
				cpf = entrada.nextLine();
				if(!validarCPF(cpf)) {
					throw new IllegalArgumentException("CPF invalido" + "Digite novamente");
				}
				break;
			}catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		  }
		}
		
		
		//criar a método(função) para validar CPF
		public static boolean validarCPF(String cpf) {//boolean pq ou dgitou certo ou errado
			//eliminar caracteres especiais
			cpf = cpf.replaceAll("\\D","");
			//verifica quantidade de caracteres
			if(cpf.length() != 11) {
				return false;
			}
			//verificar se os digitos sao todos iguais
			if(cpf.matches("\\d\\\1{10}")) {
				return false;
			}
			return true;
		}//
	}//fim de classe
