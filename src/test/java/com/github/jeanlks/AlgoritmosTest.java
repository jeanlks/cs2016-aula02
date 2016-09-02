package com.github.jeanlks;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgoritmosTest {

	// Casos de teste para Soma dos Numeros naturais
	@Test
	public void valorArbitrarioParaSoma() {
		assertEquals(6, Algoritmos.somaNaturais(3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenoresQueZeroSomaNatural() {
		Algoritmos.somaNaturais(0);

	}
	// Casos de teste para Produto

	@Test
	public void valorArbitrarioParaProduto() {
		assertEquals(9, Algoritmos.produto(3, 3));
	}

	@Test
	public void numeroAMaiorQueB() {
		assertEquals(15, Algoritmos.produto(5, 3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenoresQueZeroSomaProdutoValorA() {
		Algoritmos.produto(0, 2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenoresQueZeroSomaProdutoValorB() {
		Algoritmos.produto(3, 0);
	}

	// Casos de teste para Potencia

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQueZeroPotenciaValorX() {

		Algoritmos.potencia(0, 2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQueZeroPotenciaValorY() {

		Algoritmos.potencia(3, 0);
	}

	@Test
	public void valorArbitrarioParaPotencia() {
		assertEquals(27, Algoritmos.potencia(3, 3));
	}

	// Casos de teste para Propriedade 3025
	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQueZeroPropriedade3025() {

		Algoritmos.propriedade3025(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMaiorQue9999Propriedade3025() {

		Algoritmos.propriedade3025(100000);
	}

	@Test
	public void valorCertoParaPropriedade3025() {
		assertTrue(Algoritmos.propriedade3025(3025));
	}

	@Test
	public void valorErradoParaPropriedade3025() {
		assertFalse(Algoritmos.propriedade3025(3125));
	}

	// Casos de teste para Propriedade 153

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenorQueZeroPropriedade153() {

		Algoritmos.propriedade153(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMaiorQue9999Propriedade153() {

		Algoritmos.propriedade153(99999);
	}

	@Test
	public void valorCertoParaPropriedade153() {
		assertTrue(Algoritmos.propriedade153(153));
	}

	@Test
	public void valorErradoParaPropriedade153() {
		assertFalse(Algoritmos.propriedade153(154));
	}

	@Test
	public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
		new Algoritmos();
	}

}
