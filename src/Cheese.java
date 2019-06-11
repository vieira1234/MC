import java.util.ArrayList;

public class Cheese extends Natura {
//ATRIBUTOS
	protected String queijo;
//ACESSORES
	public String getQueijo() {
		return queijo;
	}

	public String setQueijo(String queijo) {
		this.queijo = queijo;
		return queijo;
	}
//CONSTRUTORES
	public Cheese(ArrayList<Produto> produtos, double preço) {
		super(produtos, preço);
		
	}
	
	public Cheese() {
		
	}
//METODOS

	

}
