import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class McFlurryTest {

	@Test
	// testar o construtor e gets
	void McFlurryConstrutor() {	
		McFlurry oreo = new McFlurry("McFlurry", "chocolate", "oreo", 2, 5);
		
		assertEquals(oreo.getNome(), "McFlurry");
		assertEquals(oreo.getSabor(), "chocolate");
		assertEquals(oreo.getExtra(), "oreo");
		assertEquals(oreo.getQuant(), 2);
		assertEquals(oreo.getPre�o(), 5);
	}
	
	//Testar pre�o com topping
	@Test
	void McFLurryPre�oTopping() {
		McFlurry gelado = new McFlurry();
		gelado.quant = 2;
		gelado.pre�o = 5;
		gelado.extra= "oreo";
		gelado.sabor= "morango";
		assertEquals(11,gelado.pre�o());
		assertEquals("Comeu um McFlurry com extra " + gelado.getExtra()+ " ,sabor a " +gelado.getSabor()+ " .",gelado.comer());
	}

	@Test
	void McFLurryPre�oSemTopping() {
		McFlurry gelado = new McFlurry();
		gelado.quant = 2;
		gelado.pre�o = 5;
		gelado.extra= null;
		gelado.sabor= "morango";
		assertEquals(10,gelado.pre�o());
		assertEquals("Comeu um McFlurry com sabor a "+gelado.getSabor()+" .",gelado.comer());
	}

}
