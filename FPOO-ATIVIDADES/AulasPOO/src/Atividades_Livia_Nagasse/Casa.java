package Atividades_Livia_Nagasse;

public class Casa {
	//atributos
	private String cor;
	private  float preco;
	private float metragem;
	private Quarto quarto;
    private Sala sala;  

	
	//construtores
	public Casa() {
		
	}
	
	public Casa(String cor, float preco, float metragem, Quarto quarto, Sala sala) {
		super();
		this.cor = cor;
		this.preco = preco;
		this.metragem = metragem;
		this.quarto = quarto;
		this.sala = sala;
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getMetragem() {
		return metragem;
	}

	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	
	public Quarto getQuarto() {
        return quarto;
    }

    public Sala getSala() {
        return sala;
    }
	
    
    
	 // Métodos especiais
    public void mostrarDetalhes() {
    	System.out.println("Cor da Casa: " + cor);
        System.out.println("Preço da Casa: " + preco);
        System.out.println("Metragem da Casa: " + metragem);
        System.out.println("Nome do Quarto: " + quarto.getNome());
        System.out.println("Número de Camas no Quarto: " + quarto.getNumeroCamas());
        System.out.println("Nome da Sala: " + sala.getNome());
        System.out.println("A Sala tem TV? " + sala.getTemTv());
    }
	
    
	
}
