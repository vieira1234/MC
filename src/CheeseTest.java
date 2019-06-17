import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheeseTest {

	@Test
	void cheeseConstrutor() {
		Cheese queijo = new Cheese("Cheese Burger", "normal", "carne vaca", 1, 5, "magro");
		assertEquals(queijo.getNome(),"Cheese Burger");
		assertEquals(queijo.getPao(),"normal");
		assertEquals(queijo.getCarne(),"carne vaca");
		assertEquals(queijo.getQuant(),1);
		assertEquals(queijo.getPreço(),5);
		assertEquals(queijo.getQueijo(),"magro");
		assertEquals(queijo.preço(),5);
		
	}

}
