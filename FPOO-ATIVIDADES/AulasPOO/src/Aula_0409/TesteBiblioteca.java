package Aula_0409;

import java.util.ArrayList;
import java.util.List;
public class TesteBiblioteca {

	public static void main(String[] args) {
		//instancia de objetos, mas quais?????
		//instanciando livros
		Livro l1 = new Livro("Programação em JAVA", "Deitel");
		Livro l2 = new Livro("UML", "Bezerra");
		
		//instancia da lista vazia
		List<Livro> lista_livro = new ArrayList<Livro>();
		//adicionando objs livros no obj lista
		lista_livro.add(l1);
		lista_livro.add(l2);
		
		//quero ler os livros que estão na lista
		for (Livro ver_lista : lista_livro) {
			System.out.println("livros na lista:  " + ver_lista.titulo + ver_lista.autor);
		}
		//instanciar a biblioteca
		Biblioteca bib = new Biblioteca(lista_livro);
		List<Livro> li = bib.getTotalLivrosBiblioteca();
		for (Livro livr : li) {
			System.out.println("titulo: " + livr.titulo + "Autor: " + livr.autor);
			System.out.println("total:  " + livr.autor);
		}
		
	}

}
