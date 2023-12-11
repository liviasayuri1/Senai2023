package Aula_1206;

import javax.swing.JOptionPane;

public class Multiplicacao {// nome da classe é Multiplicacao
	public static void main (String []args) {
	String primeiroNumero;
	String segundoNumero;
	
	float numero1;
	float numero2;
	float multiplica;
	
	primeiroNumero = JOptionPane.showInputDialog("Entre com o 1ºnumero:");
	segundoNumero = JOptionPane.showInputDialog("Entre com o 2ºnumero:");
	
	numero1 = Integer.parseInt(primeiroNumero);
	numero2 = Integer.parseInt(segundoNumero);
	multiplica = numero1 * numero2;
	
	JOptionPane.showMessageDialog(null, "a soma é" + multiplica, "Resultado da Soma:"
			, JOptionPane.PLAIN_MESSAGE);
	System.out.println("A soma é:" + multiplica);
	}
	

}
