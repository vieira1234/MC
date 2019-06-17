import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PedidosTest {

	@Test
	void pedidosMetodos() {
		Produto salada = new Produto("Salada", 5, 3.5);
		Produto frango = new Produto("Frango", 2, 2);
		Produto salsicha = new Produto("Salsicha",1,2);
		Pedidos pedidos = new Pedidos();
		
		//Metodo add
		pedidos.add(salada);
		pedidos.add(frango);
		pedidos.add(salsicha);
		
		//Gets
		assertEquals(pedidos.getProdutos(0).getNome(),"Salada");
		
		//Metodo contar
		assertEquals(pedidos.contar(),3);
		
		//Metodo entregaFora & polimorfismo
		assertEquals(frango.entregaFora(),"Para comer fora do restaurante");
		
		//Metodo mostrarNome i
		assertEquals(pedidos.mostrarNome(0),"Salada");
		
		//Metodo listar, erro???????
		assertEquals(pedidos.listarNomeQuantPre�o(),"Salada, Quantidade: 5, Pre�o Individual: 3.5, Total: 17.5\r\n" + 
				"Frango, Quantidade: 2, Pre�o Individual: 2.0, Total: 4.0\r\n" + 
				"Salsicha, Quantidade: 1, Pre�o Individual: 2.0, Total: 2.0");
		
		//ToString i, erro????????
		
		assertEquals(pedidos.getProdutos(0),"Produto [pre�o="+pedidos.getProdutos(0).getPre�o()+", nome="+pedidos.getProdutos(0).getNome()+", quant="+pedidos.getProdutos(0).getQuant()+"]");

	}
}
