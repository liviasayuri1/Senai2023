package Aula_1206;

public class Switch2 {
	public enum dias {dom, seg, ter}
	
	public static void main(String[] args) {
		dias [] diasHoje = dias.values();
		for(dias agora: diasHoje) { //foreach usado para listas!
			switch (agora) {
			case dom:
				System.out.println("domingo"); 
				break;
				
			case seg:
				System.out.println("segunda");
				break;
				
			case ter:
				System.out.println("terça");
				break;

			default:
				System.out.println("dias não válidos");
				break;
			}
		}

	}

}
