import java.util.ArrayList;

public class Bebida extends Produto {
	//ATRIBUTOS
	protected String nome;
	//ACESSORES
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	//CONSTRUTORES
	public Bebida(ArrayList<Produto> produtos, double preço) {
		super(produtos, preço);
	}
	//METODOS

}
