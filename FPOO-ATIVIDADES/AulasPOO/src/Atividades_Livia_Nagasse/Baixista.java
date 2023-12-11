package Atividades_Livia_Nagasse;

public class Baixista extends MembroBanda{
		public Baixista(String nome) {
			super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("O baixista " + getNome() + " está tocando o baixo!");
    }
}

