package pagamento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import boleto.Boleto;
import fatura.Fatura;

class PagFaturaBoletoTest {

	
	private List<Boleto> boletos1;
	private List<Boleto> boletos2;
	private Boleto boleto1 = new Boleto ("123", "10/10/2020", 50.00);
	private Boleto boleto2 = new Boleto ("456", "10/10/2020", 100.00);
	private Fatura fatura1 = new Fatura (1, 150.00, false);
	private Pagamento pagamento1;
	private Pagamento pagamento2;
	
	@BeforeEach
	public void inicia() {
		boletos1 = new ArrayList<Boleto>();
		boletos2 = new ArrayList<Boleto>();
		boletos1.add(boleto1);
		boletos1.add(boleto2);
		boletos2.add(boleto2);
		pagamento1= new Pagamento("10/10/2020", boletos1, fatura1);
		pagamento2= new Pagamento("10/10/2020", boletos2, fatura1);
	}
	
	
	
	@Test
	public void pagFaturaBoleto() {
		pagamento1.pagarboletofatura();
		assertEquals(true, fatura1.returnapago());
	}
	
	@Test
	public void naopagFaturaBoleto() {
		pagamento2.pagarboletofatura();
		assertEquals(false, fatura1.returnapago());
	}

}
