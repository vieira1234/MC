
public class Cheese extends Natura {
	//ATRIBUTOS
		protected String queijo;
	//ACESSORES
		public String getQueijo() {
			return queijo;
		}

	//CONSTRUTORES
		public Cheese(String nome, String pao, String carne, int quant, double preço, String queijo) {
			super(nome, pao, carne, quant, preço);
			this.queijo = queijo;
		}
		
		public Cheese() {
			
		}
	//METODOS

		

		//toString
		@Override
		public String toString() {
			return "Cheese [nome=" + nome +", queijo=" + queijo + ", pao=" + pao + ", carne=" + carne + ", quant=" + quant + ", preço="
					+ preço + "]";
		}

		
	}
