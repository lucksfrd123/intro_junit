package pagamento;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PagamentoFaturaTest {

	@Test
	public void verificarFatura() {
		Assertions.assertArrayEquals(pago, pagamento(boleto));
		
	}

}
