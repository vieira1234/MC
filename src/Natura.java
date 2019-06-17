
public class Natura extends Produto{
	//ATRIBUTOS
		protected String pao;
		protected String carne;


	//ACESSORES
		public String getPao() {
			return pao;
		}

		public String getCarne() {
			return carne;
		}



	//CONSTRUTORES
		public Natura(String nome,String pao, String carne, int quant, double preço) {
			super(nome,quant,preço);
			this.pao = pao;
			this.carne = carne;

		}
		
		public Natura() {
			
		}
		
		
	//METODOS


		
		//toString
		@Override
		public String toString() {
			return "Natura [nome= "+nome+",pao=" + pao + ", carne=" + carne + ", quant=" + quant + ", preço=" + preço + "]";
		}
		
	}

