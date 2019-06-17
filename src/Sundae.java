
public class Sundae extends Sobremesa  {
	//ATRIBUTOS
	protected String topping;
	
	//ACESSORES
	public String getTopping() {
		return topping;
	}

	
	//CONSTRUTORES
	public Sundae(String nome,String sabor,String topping, int quant, double preço) {
		super(nome, sabor,  quant, preço);
	    this.topping = topping;
	}
	public Sundae(String nome,String sabor,int quant, double preço) {
		super(nome, sabor,  quant, preço);

	}

public Sundae() {
	
};



	//METODOS
	double preço() {
		if (topping !=null) {
			return quant*preço+1;
		}else {
			return quant*preço;
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
		return "Sundae [topping=" + topping + ", sabor=" + sabor + ", preço=" + preço + ", quant=" + quant + "]";
	}



}
