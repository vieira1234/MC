import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest {

	
	@Test
	// testar o construtor e gets
	void sundaeConstrutor() {	
		Sundae gelado = new Sundae("Sundae", "Morango", "Chocolate", 3, 4);
		
		assertEquals(gelado.getNome(), "Sundae");
		assertEquals(gelado.getSabor(), "Morango");
		assertEquals(gelado.getTopping(), "Chocolate");
		assertEquals(gelado.getQuant(), 3);
		assertEquals(gelado.getPreço(), 4);
	}
	
	//Testar preço com topping
	@Test
	void sundaePreçoTopping() {
		Sundae gelado = new Sundae();
		gelado.quant = 3;
		gelado.preço = 4;
		gelado.topping= "Baunilha";
		gelado.sabor= "morango";
		assertEquals(13,gelado.preço());
		
		//Erro porque tem topping e o string é diff
		assertEquals("Comeu um Sundae com sabor a "+gelado.getSabor()+" .",gelado.comer());
	}

	@Test
	void sundaePreçoSemTopping() {
		Sundae gelado = new Sundae();
		gelado.quant = 3;
		gelado.preço = 4;
		gelado.topping= null;
		gelado.sabor = "baunilha";
		assertEquals(12,gelado.preço());
		assertEquals("Comeu um Sundae com sabor a "+gelado.getSabor()+" .",gelado.comer());
	}

	

}
