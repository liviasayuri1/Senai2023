package Atividades_Livia_Nagasse;

public class Visitante {
	public String nome;
	private int idade;
    private double altura;

    // Construtor com parâmetros
    public Visitante(int idade, double altura, String nome) {
    	this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Métodos getters e setters
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static void main(String[] args) {
        Brinquedo Brinquedo = new Brinquedo(10, 120.0, 15);

        Visitante visitante1 = new Visitante(14, 150.0, null);
        Visitante visitante2 = new Visitante(9, 130.0, null);
        Visitante visitante3 = new Visitante(13, 128.0, null);

        Brinquedo.exibirInformacoes();

        if (Brinquedo.podeAndar(visitante1.getIdade(), visitante1.getAltura())) {
        	Brinquedo.embarcar();
        } else {
            System.out.println("O visitante 1 não atende aos requisitos para andar na montanha russa.");
        }

        if (Brinquedo.podeAndar(visitante2.getIdade(), visitante2.getAltura())) {
        	Brinquedo.embarcar();
        } else {
            System.out.println("O visitante 2 não atende aos requisitos para andar na montanha russa.");
        }
        if (Brinquedo.podeAndar(visitante3.getIdade(), visitante1.getAltura())) {
        	Brinquedo.embarcar();
        }else {
        	System.out.println("O visitante 3 não atende os requisitos para andar na montanha russa");
        }
        

        Brinquedo.exibirInformacoes();
    }

	public String podeAndarNoBrinquedo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void exibirInformacoes() {
		// TODO Auto-generated method stub
		
	}
}
