package Aula_0409;

import java.util.List;

public class Turma {
	//atributos
	public String nome;
	private List <Estudante> estudantes; //agregação
	
	//construtor padrão
	public Turma() {
		
	}
	//construtor com parametros
	public Turma (String nome, List <Estudante> estudantes) {
		this.nome = nome;
		this.estudantes = estudantes;
	}
	
	//metodos getters e setteres
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List <Estudante> getEstudantes() {
		return this.estudantes;
	}
	public void setEstudantes(Estudante estudantes) {
		List<Estudante> list = (List<Estudante>) estudantes;
		this.estudantes = list;
	}
}
