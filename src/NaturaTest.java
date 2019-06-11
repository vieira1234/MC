import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class NaturaTest {

	@Test
	void naturaTest() {
		Natura test = new Natura();
		String result = test.setPao(JOptionPane.showInputDialog("Insira o tipo de pao"));
		assertEquals("Normal",result);
	}
	
	void naturaTest1() {
		Natura test = new Natura();
		String result = test.setCarne(JOptionPane.showInputDialog("Insira o tipo de carne"));
		assertEquals("Normal",result);
	}
	
}
