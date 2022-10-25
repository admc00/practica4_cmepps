package practica4_cmepps;

import java.util.ArrayList;
import java.util.List;

import practica4_cmepps.Movimiento.signo;

public class Cuenta {
	String numero;
	String titular;
	static Double saldo;
	static List <Movimiento> mMovimientos;
	
	public Cuenta(String n, String t, Double s) {
		this.numero=n;
		this.titular = t;
		Cuenta.saldo = s;
		mMovimientos = new ArrayList<Movimiento>();
	}
	
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
	public static double getSaldo() {
		return Cuenta.saldo;
	}
	
	public static void ingresar(Double ingreso) {
		Cuenta.saldo += ingreso;
		Movimiento m = new Movimiento(ingreso,"ingreso",signo.H);
		
		Cuenta.mMovimientos.add(m);
		
	}
	public static void retirar(Double retirada) throws Exception {
		try {
			if(Cuenta.saldo>=retirada) {
				saldo -=retirada;
			}
		}catch(Exception e) {
			throw new Exception("Saldo insuficiente (" + Cuenta.getSaldo() + ") para el reintegro de " + retirada);
		}
		Movimiento m = new Movimiento(retirada,"reintegro",signo.D);
		Cuenta.mMovimientos.add(m);
	}
}
