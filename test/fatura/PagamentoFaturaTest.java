package fatura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import boleto.Boleto;

class PagamentoFaturaTest {

	private Boleto boleto1 = new Boleto ("123", "10/10/2020", 50.00);
	private Fatura fatura1 = new Fatura (1, 100.00, false);
		
	@Test
	public void verificarFatura() {
		assertEquals(false, fatura1.returnapago());;
		
	}

}
