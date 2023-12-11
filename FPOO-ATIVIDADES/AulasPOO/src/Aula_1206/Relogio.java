package Aula_1206;

import java.util.Scanner;

public class Relogio {

	public static void main(String[] args) {
		
		int r = 60;//frequencia cardiaca em repouso
		int f = 190; //frequencia cardiaca atual
		int c = 95; //capacidade de oxigenação atual
		
		if (r > 3*f || c < 95) {
			System.out.println("aumentar a frequencia");
		}else if (r < 2*f && c > 97) {
			System.out.println ("diminuir a frequencia");
		}else {
			System.out.println("manter a frequencia");
			
		}

	}

}
