import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PedidosTest {

	@Test
	void pedidosTest() {
		Pedidos test = new Pedidos();
		String result = test.entregaRestaurante("Para comer fora do restaurantee");
		assertNotEquals("Para comer no restaurante",result);
	}
	
	void pedidosTest1() {
		Pedidos test = new Pedidos();
		String result = test.entregaFora("Para comer no restaurante");
		assertNotEquals("Para comer fora do restaurante",result);
	}
	
	void pedidosTest2() {
		Pedidos test = new Pedidos();
		int result = test.contar(1);
		assertNotEquals(0,result);
	}
	
	void pedidosTest3() {
		Pedidos test = new Pedidos();
		int result = test.add(Produto);
		assertNotEquals(0,result);
	}

}
