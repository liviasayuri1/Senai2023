package Sistema_sorveteria_Lívia_Nagasse;

public class Funcionário extends Pessoa{
	//atributos
	private float salario;
	public String turno;
	
	//construtores 
	public Funcionário() {
		
	}
	public Funcionário(float salario, String turno) {
		this.salario = salario;
		this.turno = turno;
	}
	
	//getters e setters
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	
}
