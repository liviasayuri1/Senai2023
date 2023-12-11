package Aula_2108;

public class SubClasse extends SuperClasse{
	protected int c;
	protected int d;
	//método construtor
	public SubClasse(){
		super();
	}
	public SubClasse(int a, int b, int c, int d) {
		super.a=a;
		super.b=b;
		this.c=c;
		this.d=d;
	}
	
	//métodos getting e setting 
	public int getC() {
		return c;
	}
	
	public int setC(int c) {
		return this.c=c;
	}
	public int getD() {
		return d;
	}
	public int setD(int d) {
		return this.d=d;
	}
	
	//método especial
		public String toString() {
			return "Você chamou o método to String da SuperClasse";
		}
}
