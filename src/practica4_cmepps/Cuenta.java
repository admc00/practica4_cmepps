package practica4_cmepps;

public class Cuenta {
	String numero;
	String titular;
	static Double saldo;
	public Cuenta(String n, String t, Double s) {
		numero=n;
		titular = t;
		saldo = s;
	}
	public static void ingresar(Double ingreso) {
		saldo=100.00;
	}
	public static double getSaldo() {
		return saldo;
	}
}
