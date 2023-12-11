package Atividades_Livia_Nagasse;

public class TesteHeranca {

	public static void main(String[] args) { 
		//instancia de objeto
		Aluno al1 = new Aluno (" Alice " , " Rio Claro " , 35839999 , 462974 , 992995310 , " Desenvolvimento de sistemas "
				, 8);
		System.out.println("o nome do aluno(a) e:" + al1.getNome() + ",O endereco do aluno(a) e: " + al1.getEndereco() 
		+ "O telefone do aluno(a) e: " + al1.gettelefone() + "O CPF do aluno (a) e:" + al1.getcpf() + 
		"O celular do aluno(a):" + al1.getcelular() + "O curso que o aluno(a) esta realizando e:" + al1.getCurso() + 
		"A nota do aluno(a) e:" + al1.getNota());
		
		Professor pr1 = new Professor (" Emily " , " Rio Claro " , 35831313 , 123456 , 981995499 , " Enfermagem "
				, 8);
		System.out.println("o nome do aluno(a) e:" + pr1.getNome() + ",O endereco do professor(a) e: " + pr1.getEndereco()
		+ "O telefone do professor(a) e: " + pr1.gettelefone() + "O CPF do professor(a) e:" + pr1.getcpf() +
		"O celular do professor(a):" + pr1.getcelular() + "O curso que o professor(a) dá aula e:" + pr1.getNomeCurso());
	}

}
