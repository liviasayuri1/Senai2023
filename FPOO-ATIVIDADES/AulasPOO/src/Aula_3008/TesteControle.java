package Aula_3008;

public class TesteControle {

	public static void main(String[] args) {
		//instanciar objetos
		Tv tv1 = new Tv();
		tv1.ligar();
		tv1.volumeMais(10);
		tv1.volumeMais(11);
		tv1.volumeMenos(12);
		System.out.println("polegadas da TV:  " + tv1.getPolegadas());
		
		
	}

}
