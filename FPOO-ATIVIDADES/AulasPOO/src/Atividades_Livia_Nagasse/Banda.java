package Atividades_Livia_Nagasse;

import java.util.List;
import java.util.ArrayList;

public class Banda {
	//atributos
	private String nome;
    private List<MembroBanda> membros;

    public Banda(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<MembroBanda> getMembros() {
        return membros;
    }

    public void adicionarMembro(MembroBanda membro) {
        membros.add(membro);
    }

    public void realizarShow() {
        System.out.println("A banda " + getNome() + " está realizando o show!");
        for (MembroBanda membro : membros) {
            membro.tocar();
        }
    }
}
	
	

