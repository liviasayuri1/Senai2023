package Aula_2308;

public class TesteBanco {

	public static void main(String[] args) {
		//instancia de obj
		CaixaEletronico cel = new CaixaEletronico();
		cel.sacar(150);
		
		Caixa cx = new Caixa ();
		cel.sacar(150);
		
		Santander st = new Santander();
		cel.sacar(150);

	}

}
