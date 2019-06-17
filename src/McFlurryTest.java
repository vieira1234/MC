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
		assertEquals(oreo.getPreço(), 5);
	}
	
	//Testar preço com topping
	@Test
	void McFLurryPreçoTopping() {
		McFlurry gelado = new McFlurry();
		gelado.quant = 2;
		gelado.preço = 5;
		gelado.extra= "oreo";
		gelado.sabor= "morango";
		assertEquals(11,gelado.preço());
		assertEquals("Comeu um McFlurry com extra " + gelado.getExtra()+ " ,sabor a " +gelado.getSabor()+ " .",gelado.comer());
	}

	@Test
	void McFLurryPreçoSemTopping() {
		McFlurry gelado = new McFlurry();
		gelado.quant = 2;
		gelado.preço = 5;
		gelado.extra= null;
		gelado.sabor= "morango";
		assertEquals(10,gelado.preço());
		assertEquals("Comeu um McFlurry com sabor a "+gelado.getSabor()+" .",gelado.comer());
	}

}
