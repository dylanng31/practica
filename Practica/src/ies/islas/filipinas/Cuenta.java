package ies.islas.filipinas;

public class Cuenta {

	private double saldo;
	private double ingreso;
	private double reintegro;
	private double calculo_ingreso;
	private double calculo_reintegro;
	//-----------------------------
	public Cuenta() {
		super();
	}
	//--------------------------------------------
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//--------------------------------------------------------
	public double getIngreso() {
		return ingreso;
	}
	public void setIngreso(double ingreso) {
		this.ingreso = ingreso;
	}
	//--------------------------------------------------------
	public double getReintegro() {
		return reintegro;
	}
	public void setReintegro(double reintegro) {
		this.reintegro = reintegro;
	}
	//-------------------------------------------------
	public double getCalculo_ingreso() {
		double calculo_ingreso = saldo + ingreso;
		return calculo_ingreso;
	}
	public void setCalculo_ingreso(double calculo_ingreso) {
		this.calculo_ingreso = calculo_ingreso;
	}
	//---------------------------------------------------------
	public double getCalculo_reintegro() {
		double calculo_reintegro= saldo-reintegro;
		return calculo_reintegro;
	}
	public void setCalculo_reintegro(double calculo_reintegro) {
		this.calculo_reintegro = calculo_reintegro;
	}

}
