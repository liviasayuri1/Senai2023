package Aula_0409;

import java.util.List;
public class Biblioteca {
	//atributos
		private List <Livro> livros; //varios livros * 
		//construtor
		public void Bibliteca() {
			
		}
		public Biblioteca(List<Livro> lista_livro) {
			List<Livro> list = (List<Livro>) lista_livro;
			this.livros = list;
		}
		
		//metodo especial
		public List <Livro> getTotalLivrosBiblioteca() {
			return livros;
		}
		
}
