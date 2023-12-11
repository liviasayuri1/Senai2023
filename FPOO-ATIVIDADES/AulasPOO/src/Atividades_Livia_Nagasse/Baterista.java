package Atividades_Livia_Nagasse;

public class Baterista extends MembroBanda{
		public Baterista(String nome) {
			super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("O baterista " + getNome() + " está tocando a bateria!");
    }
}

