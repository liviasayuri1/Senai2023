package Atividades_Livia_Nagasse;

import java.util.Scanner;

public class MoutainBike implements Veiculo{
	//Atributos 
		public int velocidade;
		public int marcha;
		Scanner entrada = new Scanner(System.in);

		public MoutainBike() {
			
		}
		
		public MoutainBike(int velocidade, int marcha) {
			this.velocidade = velocidade;
			this.marcha = marcha;
		}
		@Override
		public String mudarMarcha() {  
			String escolha = entrada.next();
			switch (escolha) {
			case ("1"):
				System.out.println("passando para proxima marcha");
				break;

			case ("0"):
				System.out.println("regredindo a marcha");
				break;
			}
			return null;
		}

		@Override
		public void acelerar() {
			entrada = null;
			String velocidade = entrada.next();
			switch (velocidade) {
			case("+"):
				System.out.println("aumentando a velocidade");
			break;
			
			case("-"):
				System.out.println("diminuindo a velocidade");
			break;
			}	
		}

		@Override
		public void frear() {
				System.out.println("freiando!");
			}
			
		}
		