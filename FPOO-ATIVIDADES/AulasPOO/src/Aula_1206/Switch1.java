package Aula_1206;

public class Switch1 {

	public static void main(String[] args) {
		int idade = 14;
		switch (idade) {
		case (10):
			System.out.println("menor de idade");
			break;
			
		case (18):
			System.out.println("maior de idade");
			break;
			
		case (70):
			System.out.println("experimente!");
			break;
			
		default:
			System.out.println("nenhuma idade válida");
			break;
		}

	}

}
