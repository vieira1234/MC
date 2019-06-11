import java.util.ArrayList;

public class Produto extends Pedidos {
//ATRIBUTOS
	protected double preço;
//ACESSORES

	public double getPreço() {
		return preço;
	}

	public double setPreço(double preço) {
		this.preço = preço;
		return preço;
	}
	
	
	
//CONSTRUTORES
	public Produto() {
	
	}
	
	public Produto(ArrayList<Produto> produtos, double preço) {
		super(produtos);
		this.preço = preço;
	}
//METODOS


}
