package Aula_0409;

public class Empregado1 {
	//atributos
	private double salario;
	private Pessoa funcionario;//composição muda o tipo de atributo
	
	//construtor padrão
	public Empregado1() {
		
	}
	//construtor com parametros
	public Empregado1(double salario, Pessoa funcionario) {
		this.salario = salario;
		this.funcionario = funcionario;
	}
	
	//get e set
	public void setSalario(int sal) {
		this.salario = sal;
	}
	public double getSalario() {
		return this.salario;
	} 
	public void setSalario(Pessoa funcionario) {
		this.funcionario = funcionario;
	}
	public Pessoa getfuncionario() {
		return this.funcionario;
	}
}
