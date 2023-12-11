package Aula_2108;

public class SubClasse1 extends ClassePai{
	//atributos
	
	//metodo construtor
	public SubClasse1() {
		super();
		nome = super.nome;
	System.out.println("Imprimi na subClasse1???");
	super.metodoImprimir();//esse metodo esta na classepai
	}

	
		
}
