
public class Produto extends Pedidos {
	//ATRIBUTOS
		protected double preço;
		protected String nome;
		protected int quant;
	//ACESSORES

		public double getPreço() {
			return preço;
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
		
		public Produto(String nome,int quant, double preço) {
			super();
			this.nome = nome;
			this.quant = quant;
			this.preço = preço;
		}
		
	/*	public Produto(int quant, double preço) {
			super();
			this.quant = quant;
			this.preço = preço;
		};*/
	//METODOS

		double preço() {
			return quant*preço;
			
			
		}


		//toString
		@Override
		public String toString() {
			return "Produto [preço=" + preço + ", nome=" + nome + ", quant=" + quant + "]";
			
		}


}
