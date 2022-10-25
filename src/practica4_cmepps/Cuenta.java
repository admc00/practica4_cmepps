package practica4_cmepps;

import java.util.List;

public class Cuenta {
	String numero;
	String titular;
	static Double saldo;
	List <Movimiento> mMovimientos;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public static void setSaldo(Double saldo) {
		Cuenta.saldo = saldo;
	}
	public Cuenta(String n, String t, Double s) {
		this.numero=n;
		this.titular = t;
		this.saldo = s;
	}
	public static void ingresar(Double ingreso) {
		saldo=100.00;
	}
	public static void retirar(Double retirada) {
		
	}
	public static double getSaldo() {
		return saldo;
	}
}
