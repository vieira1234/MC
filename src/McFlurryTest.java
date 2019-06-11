import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class McFlurryTest {

	@Test
	void mcFlurryTest() {
		McFlurry test = new McFlurry();
		int result = test.setQuantidade(1);
		assertEquals(1,result);
	}

	
	void mcFlurryTest1() {
		McFlurry test = new McFlurry();
		String result = test.setSabor(JOptionPane.showInputDialog("Insira o sabor"));
		assertEquals("Framboesa",result);
	}
}
