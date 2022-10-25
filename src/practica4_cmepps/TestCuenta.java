package practica4_cmepps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuenta {
	static Cuenta cuenta;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta("23456","Juan",60.00);
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
		cuenta.ingresar(50.00);
		assertEquals(50,cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() throws Exception {
		cuenta.retirar(60.00);
		assertEquals(00,cuenta.getSaldo());
	}

}
