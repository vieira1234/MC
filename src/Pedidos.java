import java.util.ArrayList;


public abstract class Pedidos {
//ATRIBUTOS
	ArrayList<Produto> produtos = new ArrayList <Produto>();
//ACESSORES
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	public Produto getProdutos(int i) {
		return produtos.get(i);
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void setProdutos(int i,Produto produtos) {
		this.produtos.set(i,produtos);
	}
//CONSTRUTORES
	
	public Pedidos(ArrayList<Produto> produtos) {
	super();
	this.produtos = produtos;
}

	public Pedidos() {
		super();
	}

//METODOS
	public void entregaRestaurante() {
		System.out.println("Para comer no restaurante");
	}
	
	public void entregaFora() {
		System.out.println("Para comer fora do restaurante");
	}
	
	public void add(Produto produto) {
		produtos.add(produto);
	}

	public int contar() {	
		return produtos.size();
	}
	
}


//ATRIBUTOS
//ACESSORES
//CONSTRUTORES
//METODOS