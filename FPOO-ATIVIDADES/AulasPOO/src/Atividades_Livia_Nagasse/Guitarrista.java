package Atividades_Livia_Nagasse;

public class Guitarrista extends MembroBanda{
		public Guitarrista(String nome) {
			super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("O guitarrista " + getNome() + " está tocando a guitarra!");
    }
}
