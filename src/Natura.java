import java.util.ArrayList;

public class Natura extends Produto{
//ATRIBUTOS
	protected String pao;
	protected String carne;

//ACESSORES
	public String getPao() {
		return pao;
	}

	public String setPao(String pao) {
		this.pao = pao;
		return pao;
	}

	public String getCarne() {
		return carne;
	}

	public String setCarne(String carne) {
		this.carne = carne;
		return carne;
	}
	
	
//CONSTRUTORES
	public Natura(ArrayList<Produto> produtos, double pre�o) {
		super(produtos, pre�o);
	}
	
	public Natura() {
		
	}
//METODOS
}
