import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ProdutoTest {

	@Test
	void produtoTest() {
		Produto test = new Produto();
		Double result = test.setPreço(1.3);
		assertNotEquals("1.3",result);
	}

}
