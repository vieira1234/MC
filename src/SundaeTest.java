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
		assertEquals(gelado.getPre�o(), 4);
	}
	
	//Testar pre�o com topping
	@Test
	void sundaePre�oTopping() {
		Sundae gelado = new Sundae();
		gelado.quant = 3;
		gelado.pre�o = 4;
		gelado.topping= "Baunilha";
		gelado.sabor= "morango";
		assertEquals(13,gelado.pre�o());
		
		//Erro porque tem topping e o string � diff
		assertEquals("Comeu um Sundae com sabor a "+gelado.getSabor()+" .",gelado.comer());
	}

	@Test
	void sundaePre�oSemTopping() {
		Sundae gelado = new Sundae();
		gelado.quant = 3;
		gelado.pre�o = 4;
		gelado.topping= null;
		gelado.sabor = "baunilha";
		assertEquals(12,gelado.pre�o());
		assertEquals("Comeu um Sundae com sabor a "+gelado.getSabor()+" .",gelado.comer());
	}

	

}
