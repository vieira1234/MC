

public abstract class Sobremesa extends Produto {
	//ATRIBUTOS
	protected String sabor;
	
	//ACESSORES
	public String getSabor() {
		return sabor;
	}

	
	//CONSTRUTORES
	public Sobremesa(String nome, String sabor, int quant, double pre�o) {
		super(nome, quant, pre�o);
		this.sabor = sabor;
	}

	public  Sobremesa() {
		super();
	};
	
	//METODOS
	
	public abstract String comer();

}
