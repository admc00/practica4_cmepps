package practica4_cmepps;

public class Movimiento {
	Double importe;
	String detalle;
	enum signo{D,H};
	
	public Movimiento(Double saldo, String detalle,signo D) {
		this.importe = saldo;
		this.detalle=detalle;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	};
}
