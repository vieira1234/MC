import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class SundaeTest {

	@Test
	// testar o setQuantidade
	void sundaeTest() {
		Sundae test = new Sundae();
		test.setQuantidade(1);
		assertEquals(1,test.getQuantidade());
	}

	
	void sundaeTest1() {
		Sundae test = new Sundae();
		String result = test.setSabor(JOptionPane.showInputDialog("Insira o sabor"));
		assertEquals("Framboesa",result);
	}

}
