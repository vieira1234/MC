import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SobremesaTest {

	@Test
	// testar o construtor e gets
	void SobremesaConstrutor() {	
		Sobremesa simples = new Sobremesa("Const", "melão",5,5) {
		
			@Override
			public String comer() {
			
				return "Comeu um Sundae com sabor a " +sabor+ " .";
				};
			
			
		};
		
		assertEquals(simples.getNome(),"Const");
		assertEquals(simples.getSabor(),"melão");
		assertEquals(simples.getQuant(),5);
		assertEquals(simples.getPreço(),5);
		
		assertEquals(simples.comer(),"Comeu um Sundae com sabor a " +simples.getSabor()+ " .");
	}

}
