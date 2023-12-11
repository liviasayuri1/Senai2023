package Atividades_Livia_Nagasse;

import java.time.LocalDate;
public class Voo {
	
	    //atributos
		private int numeroVoo;
		private String origem;
		private String destino;
		private double preco;
		private String dataIda;
		private String dataVolta;
		
		//construtores
		public Voo () {
			
		}
		public Voo(int numeroVoo, String origem, String destino, double preco, String dataIda, String dataVolta) {
			this.numeroVoo = numeroVoo;
			this.origem = origem;
			this.destino = destino;
			this.preco = preco;
			this.dataIda = dataIda;
			this.dataVolta = dataVolta;
		}
		//metodos get e set
		public int getNumeroVoo() {
			return numeroVoo;
		}
		public void setNumeroVoo(int numeroVoo) {
			this.numeroVoo = numeroVoo;
		}
		
		public String getOrigem() {
			return origem;
		}
		public void setOrigem(String origem) {
			this.origem = origem;
		}
		
		public String getDestino() {
			return destino;
		}
		public void setDestino(String destino) {
			this.destino = destino;
		}
		
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		public String getDataIda() {
			return dataIda;
		}
		public void setDataIda(String dataIda) {
			this.dataIda = dataIda;
		}
		
		public String getDataVolta() {
			return dataVolta;
		}
		public void setDataVolta(String dataVolta) {
			this.dataVolta = dataVolta;
		}
		//mets specials
		public void dataEstaDisponivel() {
			//fazer
		}
		public void mostrarDetalhes() {
			//fazer
		}
		
}

