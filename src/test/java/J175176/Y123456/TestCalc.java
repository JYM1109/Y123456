package J175176.Y123456;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import J175176.Y123456.Calc;

class TestCalc {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}
	Calc cal=new Calc();

	@Test
	void test() {
		assertEquals(4,cal.add(2, 2));

	}

}
