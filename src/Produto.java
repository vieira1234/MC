
public class Produto extends Pedidos {
	//ATRIBUTOS
		protected double pre�o;
		protected String nome;
		protected int quant;
	//ACESSORES

		public double getPre�o() {
			return pre�o;
		}

		
		
	public int getQuant() {
			return quant;
		}


	public String getNome() {
			return nome;
		}


		//CONSTRUTORES
		public Produto() {
		
		}
		
		public Produto(String nome,int quant, double pre�o) {
			super();
			this.nome = nome;
			this.quant = quant;
			this.pre�o = pre�o;
		}
		
	/*	public Produto(int quant, double pre�o) {
			super();
			this.quant = quant;
			this.pre�o = pre�o;
		};*/
	//METODOS

		double pre�o() {
			return quant*pre�o;
			
			
		}


		//toString
		@Override
		public String toString() {
			return "Produto [pre�o=" + pre�o + ", nome=" + nome + ", quant=" + quant + "]";
			
		}


}
