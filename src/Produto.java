import java.util.ArrayList;

public class Produto extends Pedidos {
//ATRIBUTOS
	protected double preço;
//ACESSORES

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	
	
//CONSTRUTORES
	public Produto(ArrayList<Produto> produtos) {
		super(produtos);
	}
	
	public Produto(ArrayList<Produto> produtos, double preço) {
		super(produtos);
		this.preço = preço;
	}
//METODOS


}
