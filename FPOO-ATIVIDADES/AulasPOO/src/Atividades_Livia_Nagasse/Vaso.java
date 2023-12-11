package Atividades_Livia_Nagasse;

public class Vaso {
	//Atributos
	private String material;
    private String cor;
    private double tamanho;

    //construtor padrão
    public Vaso () {
    	System.out.println("nasceu um vaso simples");
    }
    // Construtor com parametros
    public Vaso(String material, String cor, double tamanho) {
        this.material = material;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    // Métodos getters
    public String getMaterial() {
        return material;
    }

    public String getCor() {
        return cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    // Métodos setters
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    // Método para exibir informações sobre o vaso
    public void exibirInformacoes() {
        System.out.println("Informacoes sobre o vaso:");
        System.out.println("Material: " + material);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho + " cm");
    }

    

}
