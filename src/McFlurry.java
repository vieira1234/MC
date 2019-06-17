
public class McFlurry extends Sobremesa {
	//ATRIBUTOS
		protected String extra;
		
		//ACESSORES
		public String getExtra() {
			return extra;
		}

	

		
		//CONSTRUTORES
		public McFlurry(String nome,String sabor,String extra, int quant, double pre�o) {
			super(nome, sabor,  quant, pre�o);
		    this.extra = extra;
		}
		
		public McFlurry(String nome,String sabor,int quant, double pre�o) {
			super(nome, sabor,  quant, pre�o);
		}

		public McFlurry() {
			
		}


		//METODOS
		double pre�o() {
			if (extra !=null) {
				return quant*pre�o+1;
			}else {
				return quant*pre�o;
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
			return "McFlurry [extra=" + extra + ", sabor=" + sabor + ", pre�o=" + pre�o + ", quant="
					+ quant + "]";
		}
}

