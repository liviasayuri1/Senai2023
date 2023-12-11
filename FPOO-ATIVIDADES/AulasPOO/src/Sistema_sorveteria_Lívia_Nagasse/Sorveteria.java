package Sistema_sorveteria_Lívia_Nagasse;

import java.util.ArrayList;

public class Sorveteria {
	//atributos
	private double cnpj;
	private String endereco;
	private String nome;
	private int telefone;
	private ArrayList<Sorvete>Sorvetes;
	
	//construtores
	public Sorveteria() {
		
	}

	public Sorveteria(double cnpj, String endereco, String nome, int telefone, ArrayList<Sorvete>Sorvetes) {
		super();
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
		this.Sorvetes = Sorvetes;
	}
	
	
	
	//métodos getters e setters
	public double getCnpj() {
		return cnpj;
	}

	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	//métodos especiais
	public void produzirSorvete() {
		System.out.println("produzindo...");
	}
	
	public void venderSorvete() {
		System.out.println("vendendo...");
	}

	public ArrayList<Sorvete> getSorvetes() {
		return Sorvetes;
	}

	public void setSorvetes(ArrayList<Sorvete> sorvetes) {
		Sorvetes = sorvetes;
	}
	
}
