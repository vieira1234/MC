import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BebidaTest {

	@Test
	void bebidaConstrutor() {
		Bebida Cola = new Bebida("CocaCola", "M", 3, 1);
		
		assertEquals(Cola.getNome(),"CocaCola");
		assertEquals(Cola.getVolume(),"M");
		assertEquals(Cola.getQuant(),3);
		assertEquals(Cola.getPreço(),1);
		
	}
	
	@Test
	void bebidaPreço() {
		Bebida Cola = new Bebida("CocaCola", "P", 3, 1);
		Bebida Sumol = new Bebida("Sumol", "M", 3, 1);
		Bebida Fanta = new Bebida("Fanta", "G", 3, 1);
		
		assertEquals(Cola.preço(),6);
		assertEquals(Sumol.preço(),9);
		assertEquals(Fanta.preço(),12);
	}

}
