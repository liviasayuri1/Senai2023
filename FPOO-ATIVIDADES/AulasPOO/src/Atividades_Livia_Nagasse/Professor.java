package Atividades_Livia_Nagasse;

public class Professor extends Pessoa{
	//construtores
	public Professor () {
		super();
		System.out.println("Voce esta na opção professor");
	}
	public Professor(String nome, String endereco, int telefone, int cpf, int celular, String nomeCurso, float salario ) {
		super.nome=nome;
		super.endereco=endereco;
		super.telefone=telefone;
		super.cpf=cpf;
		super.celular=celular;
		super.nomeCurso=nomeCurso;
		super.salario=salario;
	}
	//getters e setters
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso (String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public float getSalario() {
		return salario;
	}
	public float setsalario(float salario) {
		return this.salario = salario;
	}
	public void imprimirinformacoes() {
		System.out.println("o curso é" + nomeCurso);
		System.out.println("o salario é de " + salario);
	}
}
