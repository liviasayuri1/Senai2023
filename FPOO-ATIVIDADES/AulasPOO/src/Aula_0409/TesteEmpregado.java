package Aula_0409;

public class TesteEmpregado {

	public static void main(String[] args) {
		//instacia de objetos
		Pessoa pes1 = new Pessoa("gerente ", "Tia Leila ", 55);
		Empregado1 emp1 = new Empregado1();//empregado é um tipo de coisa
		Empregado1 emp2 = new Empregado1(15000, pes1);
		System.out.println("cargo:  " + pes1.cargo);
		System.out.println("salario:  " + emp2.getSalario());
	}

}
