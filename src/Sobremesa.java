

public abstract class Sobremesa extends Produto {
	//ATRIBUTOS
	protected String sabor;
	
	//ACESSORES
	public String getSabor() {
		return sabor;
	}

	
	//CONSTRUTORES
	public Sobremesa(String nome, String sabor, int quant, double preço) {
		super(nome, quant, preço);
		this.sabor = sabor;
	}

	public  Sobremesa() {
		super();
	};
	
	//METODOS
	
	public abstract String comer();

}
