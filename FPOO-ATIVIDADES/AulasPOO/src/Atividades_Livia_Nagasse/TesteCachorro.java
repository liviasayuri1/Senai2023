package Atividades_Livia_Nagasse;

public class TesteCachorro {

	public static void main(String[] args) {
		//instancia de objetos
		Cachorro c1 = new Cachorro("Cristal", 3.0f, 'f', 4);
		Cachorro c2 = new Cachorro("Ferrugem", 10.0f, 'm', 4);
		Cachorro c3 = new Cachorro("Julia", 6.0f, 'f', 4);
		
		System.out.println("o nome do cachorro e " + c1.getNome() + "  o peso e:  " + c1.getPeso() + 
				"  o sexo e: " + c1.getSexo() + "  a quantidade de patas e " + c1.getQtdPatas());
		
		System.out.println("o nome do cachorro e " + c2.getNome() + "  o peso e:  " + c2.getPeso() + 
				"  o sexo e: " + c2.getSexo() + "  a quantidade de patas e " + c2.getQtdPatas());
		
		System.out.println("o nome do cachorro e " + c3.getNome() + "  o peso e:  " + c3.getPeso() + 
				"  o sexo e: " + c3.getSexo() + "  a quantidade de patas e " + c3.getQtdPatas());
	}
	

}
