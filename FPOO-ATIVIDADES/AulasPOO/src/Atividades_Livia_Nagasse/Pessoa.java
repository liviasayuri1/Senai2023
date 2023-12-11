package Atividades_Livia_Nagasse;

public class Pessoa {
	//atribiutos
		protected String nome;
		protected String endereco;
		protected int telefone;
		protected int cpf;
		protected int celular;
		public String nomeCurso;
		public float salario;
		//construtor
		public Pessoa() {
			System.out.println("Usuário");
		}
		public Pessoa(String nome, String endereco, int telefone, int cpf, int celular) {
			this.nome=nome;
			this.endereco=endereco;
			this.telefone=telefone;
			this.cpf=cpf;
		}
		//getters e setters
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco=endereco;
		}
		public int gettelefone() {
			return telefone;
		}
		public void settelefone(int telefone) {
			this.telefone=telefone;
		}
		public int getcpf() {
			return cpf;
		}
		public void setcpf(int cpf) {
			this.cpf=cpf;
		}
		public int getcelular() {
			return celular;
		}
		public int setcelular(int celular) {
			return this.celular=celular;
		}
		
}
