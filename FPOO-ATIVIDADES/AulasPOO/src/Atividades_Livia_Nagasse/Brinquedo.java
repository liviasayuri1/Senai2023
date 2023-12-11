package Atividades_Livia_Nagasse;

public class Brinquedo {
	/*//atributos
	public String nome;
	private int idadeMinima;
    private double alturaMinima;
    private int vagasDisponiveis;
    
 // Construtor padrão
    public Brinquedo() {
        this.idadeMinima = 10;
        this.alturaMinima = 120.0;
        this.vagasDisponiveis = 20;
    }
 // Construtor com parâmetros
    public Brinquedo(int idadeMinima, double alturaMinima, int vagasDisponiveis) {
        this.idadeMinima = idadeMinima;
        this.alturaMinima = alturaMinima;
        this.vagasDisponiveis = vagasDisponiveis;
    }
    //getters e setters
    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    // Condições
    public boolean podeAndar(int idade, double altura) {
        return idade >= idadeMinima && altura >= alturaMinima;
    }

    // Método para embarcar uma pessoa na montanha russa
    public void embarcar() {
        if (vagasDisponiveis > 0) {
            System.out.println("Você embarcou na montanha russa!");
            vagasDisponiveis--;
        } else {
            System.out.println("Desculpe, todas as vagas estão ocupadas.");
        }
    }

    // Método para exibir informações sobre a montanha russa
    public void exibirInformacoes() {
        System.out.println("Idade mínima: " + idadeMinima + " anos");
        System.out.println("Altura mínima: " + alturaMinima + " cm");
        System.out.println("Vagas disponíveis: " + vagasDisponiveis);
    }

    

        Brinquedo.exibirInformacoes();
    }*/
	
	//instancia do segundo brinquedo
	//atributos
		public String nome;
		private int idadeMinima;
	    private double alturaMinima;
	    private int vagasDisponiveis;
	    
	 // Construtor padrão
	    public Brinquedo() {
	        this.idadeMinima = 8;
	        this.alturaMinima = 110.0;
	        this.vagasDisponiveis = 34;
	    }
	 // Construtor com parâmetros
	    public Brinquedo(int idadeMinima, double alturaMinima, int vagasDisponiveis) {
	        this.idadeMinima = idadeMinima;
	        this.alturaMinima = alturaMinima;
	        this.vagasDisponiveis = vagasDisponiveis;
	    }
	      
	      //getters e setters
	        public int getIdadeMinima() {
	            return idadeMinima;
	        }

	        public void setIdadeMinima(int idadeMinima) {
	            this.idadeMinima = idadeMinima;
	        }

	        public double getAlturaMinima() {
	            return alturaMinima;
	        }

	        public void setAlturaMinima(double alturaMinima) {
	            this.alturaMinima = alturaMinima;
	        }

	        public int getVagasDisponiveis() {
	            return vagasDisponiveis;
	        }

	        public void setVagasDisponiveis(int vagasDisponiveis) {
	            this.vagasDisponiveis = vagasDisponiveis;
	        }
	     // Método para verificar se uma pessoa pode andar na roda gigante
	        public boolean podeAndar(int idade, double altura) {
	            return idade >= idadeMinima && altura >= alturaMinima;
	        }
	        
	     // Método para embarcar uma pessoa na roda gigante
	        public void embarcar() {
	            if (vagasDisponiveis > 0) {
	            	System.out.println("Você embarcou na roda gigante!");
	                vagasDisponiveis--;
	            } else {
	                System.out.println("Desculpe, todas as vagas estão ocupadas.");
	            }
	        }

	        // Método para exibir informações sobre a montanha russa
	        public void exibirInformacoes() {
	            System.out.println("Idade mínima: " + idadeMinima + " anos");
	            System.out.println("Altura mínima: " + alturaMinima + " cm");
	            System.out.println("Vagas disponíveis: " + vagasDisponiveis);
	        }

	        public static void main(String[] args) {
	            Brinquedo Brinquedo = new Brinquedo(8, 110.0, 15);

	            Brinquedo.exibirInformacoes();

	            if (Brinquedo.podeAndar(8, 110.0)) {
	                Brinquedo.embarcar();
	            } else {
	                System.out.println("Essa pessoa não atende aos requisitos para andar na montanha russa.");
	            }

	            Brinquedo.exibirInformacoes();
	        }
			public void nome(String string) {
				System.out.println();
				
			}

}

