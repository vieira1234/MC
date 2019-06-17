import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class ProdutoTest {

	@Test
	void produtoConstrutor() {
		Produto produto = new Produto("Salada", 5, 3.5);
		assertEquals(produto.getNome(),"Salada");
		assertEquals(produto.getQuant(),5);
		assertEquals(produto.getPre�o(),3.5);
		assertEquals(produto.pre�o(),17.5);

	}

}
