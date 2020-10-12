package fatura;

import boleto.Boleto;

public class Fatura {
	
	private int idfat;
	private double fatvalor;
	private boolean pago; 
	
	
	public Fatura(int idfat, double fatvalor, boolean pago){
		super();
		this.idfat = idfat;
		this.fatvalor = fatvalor;
		this.pago = pago;
	}
	
	
	public boolean returnapago() {
		return pago;
	}
}