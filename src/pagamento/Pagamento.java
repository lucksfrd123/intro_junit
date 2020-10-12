package pagamento;

import java.util.List;
import boleto.Boleto;
import fatura.Fatura;

class Pagamento {
	
	private String data;
	private List<Boleto> boletos;
	private Fatura f;


	public Pagamento(String data, List<Boleto> boletos, Fatura f) {
		super();
		this.setData(data);
		this.setBoletos(boletos);
		this.f = f;
		
	}
	
	
	public void pagarboletofatura() {
		f.setpago(true);
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public List<Boleto> getBoletos() {
		return boletos;
	}


	public void setBoletos(List<Boleto> boletos) {
		this.boletos = boletos;
	}
}
