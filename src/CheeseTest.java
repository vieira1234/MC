import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class CheeseTest {

	@Test
	void cheeseTest() {
		Cheese test = new Cheese();
		String result = test.setQueijo(JOptionPane.showInputDialog("Insira o tipo de queijo"));
		assertEquals("Normal",result);
	}

}
