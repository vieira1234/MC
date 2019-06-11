import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

class BebidaTest {

	@Test
	void bebidaTest() {
		Bebida test = new Bebida();
		String result = test.setNome(JOptionPane.showInputDialog("Insira o nome de Bebida"));
		assertEquals("Normal",result);
	}

}
