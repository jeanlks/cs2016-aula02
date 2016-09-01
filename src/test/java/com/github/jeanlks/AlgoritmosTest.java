package com.github.jeanlks;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgoritmosTest {

	@Test
	public void numeroCertoParaSoma() {
		assertEquals(6, Algoritmos.somaNaturais(3));
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenoresQueZeroSomaNatural() {
		Algoritmos.somaNaturais(0);

	}

	@Test
	public void numeroCertoParaProduto() {
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

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenoresQueZeroPotenciaValorX() {

		Algoritmos.potencia(0, 2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void numeroMenoresQueZeroPotenciaValorY() {

		Algoritmos.potencia(3, 0);
	}
	@Test 
	public void numeroCertoParaPotencia(){
		assertEquals(27, Algoritmos.potencia(3, 3));
	}

	@Test
	public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
		new Algoritmos();
	}
}	
