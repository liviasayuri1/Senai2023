package Aula_2108;

import br.org.sesisp.java.livia.ClasseExterna;

public class TesteVisibilidade {

	public static void main(String[] args) {
		//instancia de objetos 
		SubClasse1 sub1 = new SubClasse1();
		System.out.println("senha vista pela SubClasse" + sub1.getSenha());
		
		SubClasse2 sub2 = new SubClasse2();
		System.out.println("senha vista pela subclasse2" + sub2.getSenha());
		
		//obj da classe externa
		ClasseExterna cx = new ClasseExterna();
		System.out.println("senha vista pela classe externa" + cx.getSenha());
		//instanciando uma classe abstrata
		/*NÃO PODEMOS
		 * ClassePai cp = new ClassePai();
		 * cp.nome = "sei la;*/
	}

}
