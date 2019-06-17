
public class Sundae extends Sobremesa  {
	//ATRIBUTOS
	protected String topping;
	
	//ACESSORES
	public String getTopping() {
		return topping;
	}

	
	//CONSTRUTORES
	public Sundae(String nome,String sabor,String topping, int quant, double pre�o) {
		super(nome, sabor,  quant, pre�o);
	    this.topping = topping;
	}
	public Sundae(String nome,String sabor,int quant, double pre�o) {
		super(nome, sabor,  quant, pre�o);

	}

public Sundae() {
	
};



	//METODOS
	double pre�o() {
		if (topping !=null) {
			return quant*pre�o+1;
		}else {
			return quant*pre�o;
		}
	}

	@Override
	public String comer() {
		if (topping !=null) {
		return"Comeu um Sundae com topping " + topping+ " ,sabor a " +sabor+ " .";
		}else {
		return "Comeu um Sundae com sabor a " +sabor+ " .";
		}
	}

	
	//toString
	@Override
	public String toString() {
		return "Sundae [topping=" + topping + ", sabor=" + sabor + ", pre�o=" + pre�o + ", quant=" + quant + "]";
	}



}
