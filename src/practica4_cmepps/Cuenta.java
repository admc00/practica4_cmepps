package practica4_cmepps;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import practica4_cmepps.Movimiento.signo;

public class Cuenta {
	String numero;
	String titular;
	Double saldo;
	static List<Movimiento> mMovimientos;

	public Cuenta(String n, String t, Double s) {
		this.numero = n;
		this.titular = t;
		saldo = s;
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

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void ingresar(Double ingreso) {
		this.setSaldo(this.getSaldo() + ingreso);
		Movimiento m = new Movimiento(ingreso, "ingreso", signo.H);

		Cuenta.mMovimientos.add(m);

	}

	public void retirar(Double retirada) throws Exception {
		try {
			if((this.getSaldo() - retirada) >= (-500)) {
				this.setSaldo(this.getSaldo()-retirada);
			}else
				throw new Exception();
		}catch(Exception e) {
			System.out.println(e + " Saldo insuficiente (" + this.getSaldo() + ") para el reintegro de " + retirada);
		}
		Movimiento m = new Movimiento(retirada,"reintegro",signo.D);
		Cuenta.mMovimientos.add(m);
	}
}
