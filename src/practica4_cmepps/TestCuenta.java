package practica4_cmepps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuenta {
	static Cuenta cuenta;
	static Cuenta cuenta2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta("12345","Juan",50.00);
		cuenta2 = new Cuenta("67890","Pepe",00.00);
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
	void testC1() throws Exception {
		cuenta.retirar(200.00);//1
		cuenta.ingresar(100.00);//3
		cuenta.retirar(200.00);//6
		assertEquals(-250,cuenta.getSaldo());
	}
	@Test
	void testC2() throws Exception{
		cuenta2.retirar(350.00);//2
		cuenta2.retirar(200.00);//4
		cuenta2.retirar(150.00);//5
		cuenta2.ingresar(50.00);//7
		cuenta2.retirar(100.00);//8
		assertEquals(-450,cuenta2.getSaldo());
	}
	
	

}
