package Atividades_Livia_Nagasse;

public class Vocalista extends MembroBanda{
	//construtores/métodos
	public Vocalista(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("O vocalista " + getNome() + " está cantando!");
    }
}
