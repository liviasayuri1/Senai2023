package Atividades_Livia_Nagasse;

public class VasoDecorado extends Vaso{
	// Atributo adicional
    private String estiloDecoracao;
    
    //construtor padrão
    public VasoDecorado() {
    	System.out.println("nasceu um vaso decorado");
    }

    // Construtor com parametros
    public VasoDecorado(String material, String cor, double tamanho, String estiloDecoracao) {
        super(material, cor, tamanho); // Chama o construtor da classe pai
        this.estiloDecoracao = estiloDecoracao;
    }

    // Métodos getters e setters
    public String getEstiloDecoracao() {
        return estiloDecoracao;
    }
    public void setEstiloDecoracao(String estiloDecoracao) {
        this.estiloDecoracao = estiloDecoracao;
    }

    // Sobrescrevendo o método exibirInformacoes da classe pai
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); // Chama o método da classe pai
        System.out.println("Estilo de Decoracao: " + estiloDecoracao);
    }

    public static void main(String[] args) {
        VasoDecorado meuVasoDecorado = new VasoDecorado("Porcelana", "Branco", 30.0, "Clássico");
        meuVasoDecorado.exibirInformacoes();
    }
}
