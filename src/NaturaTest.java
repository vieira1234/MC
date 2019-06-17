import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class NaturaTest {

	@Test
	void naturaConstrutor() {
		Natura hamburguer = new Natura("BigMac", "normal", "carne vaca", 1, 4);
		assertEquals(hamburguer.getNome(),"BigMac");
		assertEquals(hamburguer.getPao(),"normal");
		assertEquals(hamburguer.getCarne(),"carne vaca");
		assertEquals(hamburguer.getQuant(),1);
		assertEquals(hamburguer.getPreço(),4);
		assertEquals(hamburguer.preço(),4);

	}
	
	
	
}
