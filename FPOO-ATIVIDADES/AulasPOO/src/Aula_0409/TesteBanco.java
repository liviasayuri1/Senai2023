package Aula_0409;

public class TesteBanco {

	public static void main(String[] args) {
		//instacia de objetos
		//teste associacao
		Banco b1 = new Banco("Caixa");
		Empregado emp1 = new Empregado("Jose");
		//teste
		System.out.println("o " + emp1.getNome() + "trabalha no Banco" + b1.getNome());
	}

}
