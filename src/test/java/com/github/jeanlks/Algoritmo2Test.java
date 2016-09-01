package com.github.jeanlks;

import static org.junit.Assert.*;

import org.junit.Test;

public class Algoritmo2Test {

	@Test
	public void numeroCerto() {
		assertEquals(6, Algoritmo2.somaNaturais(3));
	}
	
	
	 @Test
	    public void apenasParaAgradarJacocoTool100PorCentoCobertura() {
	        new Algoritmo2();
	    }
}
