import java.util.ArrayList;

public class Produto extends Pedidos {
//ATRIBUTOS
	protected double pre�o;
//ACESSORES

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	
	
//CONSTRUTORES
	public Produto(ArrayList<Produto> produtos) {
		super(produtos);
	}
	
	public Produto(ArrayList<Produto> produtos, double pre�o) {
		super(produtos);
		this.pre�o = pre�o;
	}
//METODOS


}
