package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matcher.*;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import produto.Produto;


class CarrinhoTest {

	private Carrinho carro = new Carrinho();
	private Produto bola = new Produto("Bola", 5.00);
	private Produto peteca = new Produto("Peteca", 1.00);
	
		
	
	@Test
	public void testCalculaPreco(){
		carro.addItem(bola);
		carro.addItem(peteca);
		double precoTotal = carro.getValorTotal();        
        assertEquals(6.00, precoTotal);
	}

	@Test
	public void testEsvaizaCarrinho(){
		carro.addItem(bola);
		carro.addItem(peteca);
		carro.esvazia();     
        assertTrue(carro.getQtdeItems() == 0);
	}


}
	