import java.util.ArrayList;

public class Cheese extends Natura {
//ATRIBUTOS
	protected String queijo;
//ACESSORES
	public String getQueijo() {
		return queijo;
	}

	public void setQueijo(String queijo) {
		this.queijo = queijo;
	}
//CONSTRUTORES
	public Cheese(ArrayList<Produto> produtos, double pre�o) {
		super(produtos, pre�o);
		
	}
//METODOS

}
