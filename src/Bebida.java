import java.util.ArrayList;

public class Bebida extends Produto {
	//ATRIBUTOS
	protected String nome;
	//ACESSORES
	public String getNome() {
		return nome;
	}

	public String setNome(String nome) {
		this.nome = nome;
		return nome;
	}
	//CONSTRUTORES
	public Bebida(ArrayList<Produto> produtos, double pre�o) {
		super(produtos, pre�o);
	}
	
	public Bebida() {
		// TODO Auto-generated constructor stub
	}
	//METODOS


}
