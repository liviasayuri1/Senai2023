package Atividades_Livia_Nagasse;

public class TesteBanda {

	public static void main(String[] args) {
		Banda minhaBanda = new Banda("Primeira Banda");

        Vocalista vocalista = new Vocalista("Joao");
        Baixista baixista = new Baixista("Maria");
        Baterista baterista = new Baterista("Carlos");
        Guitarrista guitarrista = new Guitarrista("Ana");

        minhaBanda.adicionarMembro(vocalista);
        minhaBanda.adicionarMembro(baixista);
        minhaBanda.adicionarMembro(baterista);
        minhaBanda.adicionarMembro(guitarrista);

        minhaBanda.realizarShow();
        
        //segunda banda
        Banda minhaBanda2 = new Banda("Segunda Banda");

        Vocalista vocalista2 = new Vocalista("Pedro");
        Baixista baixista2 = new Baixista("Guilherme");
        Baterista baterista2 = new Baterista("Danilo");
        Guitarrista guitarrista2 = new Guitarrista("Allana");

        minhaBanda2.adicionarMembro(vocalista2);
        minhaBanda2.adicionarMembro(baixista2);
        minhaBanda2.adicionarMembro(baterista2);
        minhaBanda2.adicionarMembro(guitarrista2);

        minhaBanda2.realizarShow();
	}

}
