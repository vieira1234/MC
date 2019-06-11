import java.util.ArrayList;


public class Pedidos {
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
	public String entregaRestaurante(String s) {
		s = "Para comer no restaurante";
		return s;
	}
	
	public String entregaFora(String s) {
		s= "Para comer fora do restaurante";
		return s;
	}
	
	public void add(Produto produto) {
		produtos.add(produto);
	}

	public int contar(int n) {
		n = produtos.size();
		return n;
	}
	
}


//ATRIBUTOS
//ACESSORES
//CONSTRUTORES
//METODOS