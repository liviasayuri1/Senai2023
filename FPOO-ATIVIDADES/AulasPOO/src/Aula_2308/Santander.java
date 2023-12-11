package Aula_2308;

public class Santander extends CaixaEletronico{
	public void sacar (double valor) {
		valor = valor + 1.5;//taxa cobrada pela transação
		System.out.println("O seu saque na caixa economica federal foi = " + valor);
	}
}
