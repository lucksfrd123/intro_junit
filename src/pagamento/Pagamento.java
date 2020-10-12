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
		this.data = data;
		this.boletos = boletos;
		this.f = f;
		
	}
	
	
	public void pagarboletofatura() {
		f.setpago(true);
	}
}
