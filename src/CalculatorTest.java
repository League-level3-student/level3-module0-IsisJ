import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testingAddition() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(1, 1), 2);
		assertEquals(calculator.add(-1,-1), -2);
		assertEquals(calculator.add(-1,1), 0);
		assertEquals(calculator.add(1,-1), 0);
	}
	
	void testingFloatAddition() {
		Calculator calc = new Calculator();
		assertEquals(calc.addDoubles(1.5,1.5), 3.0);
		assertEquals(calc.addDoubles(-1.5,-1.5), -3.0);
		assertEquals(calc.addDoubles(-1.5,1.5), 0.0);
		assertEquals(calc.addDoubles(1.5,-1.5), 0.0);
	}

}
