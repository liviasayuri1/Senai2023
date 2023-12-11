package Atividades_Livia_Nagasse;

import java.util.Scanner;

public class Aluno extends Pessoa{
	//atributos
	private String curso;
	private float nota, media;
	//construtor
	public Aluno() {
		super();
		System.out.println("Você está na opção aluno");
	}
	public Aluno(String nome, String endereco, int telefone, int cpf, int celular, String curso, float nota) {
		this.curso=curso;
		this.nota=nota;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.celular = celular;
	}
	//getters e setters
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso=curso;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota=nota;
	}
	
	//calcular media
	public void calcularMedia (Scanner entrada) {
		System.out.println("insira sua primeira nota");
		nota=entrada.nextFloat();
		System.out.println("insira sua segunda nota");
		nota=entrada.nextFloat();
		media=(nota+nota)/2;
		System.out.println("sua media é" + media);
	}
	public void notaMedia() {
		if(media>=7.0) {
			System.out.println("Você foi aprovado");
		}else {
			System.out.println("Você foi reprovado");
		}
	}
}
