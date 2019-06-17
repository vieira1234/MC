
public class McFlurry extends Sobremesa {
	//ATRIBUTOS
		protected String extra;
		
		//ACESSORES
		public String getExtra() {
			return extra;
		}

	

		
		//CONSTRUTORES
		public McFlurry(String nome,String sabor,String extra, int quant, double preço) {
			super(nome, sabor,  quant, preço);
		    this.extra = extra;
		}
		
		public McFlurry(String nome,String sabor,int quant, double preço) {
			super(nome, sabor,  quant, preço);
		}

		public McFlurry() {
			
		}


		//METODOS
		double preço() {
			if (extra !=null) {
				return quant*preço+1;
			}else {
				return quant*preço;
			}
		}

		@Override
		public String comer() {
			if (extra !=null) {
				return "Comeu um McFlurry com extra " + extra+ " ,sabor a " +sabor+ " .";
			}else {
			return "Comeu um McFlurry com sabor a " +sabor+ " .";
			}
		}

		
		//toString

		@Override
		public String toString() {
			return "McFlurry [extra=" + extra + ", sabor=" + sabor + ", preço=" + preço + ", quant="
					+ quant + "]";
		}
}

