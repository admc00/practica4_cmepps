package practica4_cmepps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuenta {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Cuenta cuenta = new Cuenta("23456","Juan",50.00);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		Cuenta.ingresar(50.00);
		assertEquals(100,Cuenta.getSaldo());
	}

}
