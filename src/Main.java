
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pedidos pedidos = new Pedidos();
		
		Produto produtos;
		
		//adicionar natura
		Cheese DC = new Cheese("Double Cheeseburger", "Normal", "Porco", 4, 5, "Cheddar");
		pedidos.add(DC);
		System.out.println(DC.toString());
		System.out.println(DC.preço());

		
		
		
		Natura BigMac = new Natura("Big Mac", "Trigo", "vaca", 2, 3);
		pedidos.add(BigMac);
		System.out.println(BigMac.toString());
		System.out.println(BigMac.preço());
		
		
		Bebida Cola = new Bebida("Cola", "G", 2, 3);
		System.out.println(Cola.toString());
		System.out.println(Cola.preço());
		
		
		System.out.println(pedidos.listarNomeQuantPreço());
		System.out.println(pedidos.entregaRestaurante());
		System.out.println(pedidos.mostrarNome(0));
		System.out.println(pedidos.mostrarNome(1));
		System.out.println(pedidos.contar());
		
		
		//Adicionar produtos
		
		Bebida bebida = new Bebida("Fanta", "G", 2, 5.5);
		pedidos.add(bebida);
		Bebida sumol = new Bebida("Sumol", "P", 3, 4);
		pedidos.add(sumol);
		//Mostrar toString da fanta
		System.out.println(bebida.toString());
		System.out.println(((Produto)bebida).toString());

		
		//////////////////versão 2//////////////////////
		produtos = new Bebida("Sagres", "M", 2, 10);
		pedidos.add(produtos);
		produtos = new Bebida("CocaCola", "M", 6, 15);
		pedidos.add(produtos);
		//toString do sumol
		System.out.println(produtos.toString());
		System.out.println(((Produto)produtos).toString());
		
		//Mostrar preço e nome das bebidas
		System.out.println("O preço da "+bebida.getNome()+" é: "+bebida.preço() + " euros");
		System.out.println("Total de pedidos: "+pedidos.contar());
		
		System.out.println("O preço do "+sumol.getNome()+" é: "+sumol.preço() + " euros");
		System.out.println(produtos.toString());
		System.out.println("O preço do "+produtos.getNome()+" é: "+produtos.preço() + " euros");
		
		//Listar nome, quant, preço
		System.out.println(pedidos.listarNomeQuantPreço());
		
		//adicionar Sundae
		produtos = new Sundae("Sundae", "Morango", "Chocolate", 2, 2);
		pedidos.add(produtos);
		System.out.println(produtos.toString());
		//mostrar preço do Sundae
		Sundae sundae = new Sundae("Sundae", "Morango", "Caramelo", 1, 3);
		pedidos.add(sundae);
		System.out.println(produtos.preço());
		
		//adicionar mcflurry cFlurry("oreo", 1, 2.5);
		McFlurry oreo = new McFlurry("McFlurry", "Chocolate", "KitKat", 3, 1);
		pedidos.add(oreo);
		System.out.println(oreo.toString());
		//mostrar preço do gelado
		System.out.println(oreo.preço());
		
		//listar todos os pedidos
		System.out.println(pedidos.listarNomeQuantPreço());
		
		//adicionar natura
		Natura chicken = new Natura("CBO", "CBO", "frango", 2, 5.78);
		pedidos.add(chicken);
		System.out.println(chicken.preço());
		System.out.println(pedidos.listarNomeQuantPreço());
		System.out.println(chicken.toString());
		
		//adicionar cheese
		Cheese doublecheese = new Cheese("Double Cheese", "normal", "vaca", 1, 2, "cheddar");
		pedidos.add(doublecheese);
		System.out.println(doublecheese.preço());
		System.out.println(doublecheese.toString());
		System.out.println(sundae.comer());
		System.out.println(oreo.comer());
        System.out.println(oreo.entregaRestaurante());
		
		System.out.println(sundae.getTopping());
		System.out.println(pedidos.getProdutos(0));
		Produto salada = new Produto("Salada", 5, 3.5);
		Produto frango = new Produto("Frango", 2, 2);
		Produto salsicha = new Produto("Salsicha",1,2);
		pedidos.add(salada);
		pedidos.add(frango);
		pedidos.add(salsicha);
		System.out.println(pedidos.listarNomeQuantPreço());
	}

}
