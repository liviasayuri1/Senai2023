package Aula_0409;

import java.util.List;

public class Faculdade {
	//Aributos
	private String nomeFacul;
	private List<Turma> cursos;
	
	//construtor padrão
	public Faculdade() {
		
	}
	//construtor com parametros
	public Faculdade(String nomeFacul, List<Turma> cursos) {
		this.nomeFacul = nomeFacul;
		this.cursos = cursos;
	}
	//metodo para pegar o total de estudantes
	public int getTotalEstudantes() {
		int nEstudantes = 0;
		List<Estudante> estudante;
		for(Turma cur : cursos) {
			estudante = cur.getEstudantes();
			for (Estudante s : estudante) {
				nEstudantes ++;
			}
		}
		return nEstudantes;
	}
	//metodos getters e setters
	public String getNomeFacul() {
		return nomeFacul;
	}
	public void setNomeFacul(String nomeFacul) {
		this.nomeFacul = nomeFacul;
	}
	public List<Turma> getCursos() {
		return cursos;
	}
	public void setCursos(List<Turma> cursos) {
		this.cursos = cursos;
	}
}
