import java.util.ArrayList;

public class Produto extends Pedidos {
//ATRIBUTOS
	protected double pre�o;
//ACESSORES

	public double getPre�o() {
		return pre�o;
	}

	public double setPre�o(double pre�o) {
		this.pre�o = pre�o;
		return pre�o;
	}
	
	
	
//CONSTRUTORES
	public Produto() {
	
	}
	
	public Produto(ArrayList<Produto> produtos, double pre�o) {
		super(produtos);
		this.pre�o = pre�o;
	}
//METODOS


}
