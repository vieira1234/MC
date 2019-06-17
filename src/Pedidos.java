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
	
	public void setProdutos(int i,Produto produto) {
		this.produtos.set(i,produto);
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
	public String entregaRestaurante() {
		return "Para comer no restaurante";
	}
	
	public String entregaFora() {
		return "Para comer fora do restaurante";
	}
	
	public void add(Produto produto) {
		produtos.add(produto);
	}

	public int contar() {
		return produtos.size();
	}
	
	public String mostrarNome(int i) {
		
		return produtos.get(i).getNome();

	};
	
	public String listarNomeQuantPreço() {
		String texto = "";
		for (int i = 0; i < produtos.size(); i++) {
			texto += produtos.get(i).getNome() + ", Quantidade: " + produtos.get(i).getQuant() + ", Preço Individual: " + produtos.get(i).getPreço()+ ", Total: "+produtos.get(i).preço()+"\n";
		}
			return texto;
		}

	@Override
	public String toString() {
		return "Pedidos [produtos=" + produtos + "]";
	};
		
		
}


//ATRIBUTOS
//ACESSORES
//CONSTRUTORES
//METODOS