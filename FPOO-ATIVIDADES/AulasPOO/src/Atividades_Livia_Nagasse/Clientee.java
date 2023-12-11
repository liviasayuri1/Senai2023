package Atividades_Livia_Nagasse;

public class Clientee {
    private String nome;
    private String sobrenome;
    private String email;

    // Construtores
    public Clientee() {
    }

    public Clientee(String nome, String sobrenome, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    // Getters e Setters
    

    @Override
    public String toString() {
        return "Clientee [nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + "]";
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
