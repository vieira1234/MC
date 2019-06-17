

public class Bebida extends Produto {
	//ATRIBUTOS
	protected String volume;
	
	
	//ACESSORES
	public String getVolume() {
		return volume;
	}
	
	

	//CONSTRUTORES
	
	public Bebida(String nome, String volume, int quant, double pre�o) {
		super(nome, quant, pre�o);
		this.volume = volume;
	}


	public Bebida() {
	
	}
	
	//METODOS

	@Override
	double pre�o() {
		int y=0;
		if (volume == "P") {
			y=1;
		}else if (volume == "M") {
			y=2;
		}else if (volume == "G") {
			y=3;
		}
		return (quant*pre�o)+(y*quant);
		
	}

	//toString
	@Override
	public String toString() {
		return "Bebida [nome=" + nome + ", quantidade=" + quant + ", pre�o=" + pre�o + "]";
	}


}
