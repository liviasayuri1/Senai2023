package Atividades_Livia_Nagasse;

public class TesteCliente {

	public static void main(String[] args) {
		//instanciar um objeto
		Clientee cli1 = new Clientee ();
		cli1.nome = "Tião Carreiro";
		System.out.println("nome: " + cli1.nome);
		cli1.altura=1.77;
		System.out.println("altura: " + cli1.altura);
		cli1.peso = 82.6;
		double imc = cli1.peso / (cli1.altura*cli1.altura);
		System.out.println("IMC do cli1: " + imc);
		cli1.calcularIMC();
		System.out.println("IMC do cli1 através do método " +
		cli1.calcularIMC());
		cli1.calcularPesoDesejado(100);
		
	}

}
