import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BebidaTest {

	@Test
	void bebidaConstrutor() {
		Bebida Cola = new Bebida("CocaCola", "M", 3, 1);
		
		assertEquals(Cola.getNome(),"CocaCola");
		assertEquals(Cola.getVolume(),"M");
		assertEquals(Cola.getQuant(),3);
		assertEquals(Cola.getPre�o(),1);
		
	}
	
	@Test
	void bebidaPre�o() {
		Bebida Cola = new Bebida("CocaCola", "P", 3, 1);
		Bebida Sumol = new Bebida("Sumol", "M", 3, 1);
		Bebida Fanta = new Bebida("Fanta", "G", 3, 1);
		
		assertEquals(Cola.pre�o(),6);
		assertEquals(Sumol.pre�o(),9);
		assertEquals(Fanta.pre�o(),12);
	}

}
