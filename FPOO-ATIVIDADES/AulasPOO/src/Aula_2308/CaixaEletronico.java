package Aula_2308;

public class CaixaEletronico {//serviço 24hrs varios bancos
	//atributos
	//construtores
	//getters e setters
	//metodo especial
	public void sacar (double valor) {
		valor = valor + 0.5; //taxa cobrada pela transação
		System.out.println("O seu saque no caixa eletronico foi = " + valor);
	}
}
