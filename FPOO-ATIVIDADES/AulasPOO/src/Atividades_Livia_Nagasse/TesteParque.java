package Atividades_Livia_Nagasse;

public class TesteParque {

	    public static void main(String[] args) {
	Brinquedo Brinquedo = new Brinquedo(12,140.0,15);
	Visitante visitante1 = new Visitante (14,150.0, null);
	Visitante visitante2 = new Visitante (10,130.0, null);
	
	
	Brinquedo.exibirInformacoes();
	
	if (Brinquedo.podeAndar(visitante1.getIdade(), visitante1.getAltura())) {
		Brinquedo.embarcar();
	}else {
		System.out.println("O visitante 1 não poderá andar na montanha-russa");
	}
	
	if (Brinquedo.podeAndar(visitante2.getIdade(), visitante2.getAltura())){
		Brinquedo.embarcar();
	}else {
		System.out.println("O visitante 2 não poderá andar na montanha russa");
	}
	 
	Brinquedo.exibirInformacoes();

	}
}


