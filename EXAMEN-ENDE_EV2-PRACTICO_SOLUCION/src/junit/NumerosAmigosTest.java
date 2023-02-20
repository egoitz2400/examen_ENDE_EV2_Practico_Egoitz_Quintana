package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		NumerosAmigos a1 = new NumerosAmigos(2, 10);
		assertFalse(a1.amigo());
	}

	@Test
	public void testAmigoPerfecto() {
		NumerosAmigos a1 = new NumerosAmigos(2, 3);
		assertTrue(a1.amigo());
	}

	@Test
	public void testEsCeroN1() {
		NumerosAmigos a = new NumerosAmigos(0, 5);
		assertNull(a.esN1IgualAN2());
	}

	@Test
	public void testN1yN2SonIguales() {
		NumerosAmigos a = new NumerosAmigos(5, 5);
		assertEquals(5, a);
	}
	
	@Test
	public void testN1yN2NoSonIguales() {
		int valorEsperado=5;
		NumerosAmigos a = new NumerosAmigos(2, 5);
		NumerosAmigos resultado = a;
		assertNotEquals(valorEsperado, resultado);
	}
}
