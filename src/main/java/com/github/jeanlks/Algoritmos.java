package com.github.jeanlks;

/**
 * Algoritmos definidos como exercicio para aula2.
 */
public class Algoritmos {
	/**
	 * @param i
	 *            serve para variável de iteração.
	 * @param s
	 *            mantém a soma da conta a cada ciclo de i.
	 * @param n
	 *            número que se deseja saber a soma dos naturais
	 * 
	 * @return soma dos números naturais até n
	 */
	public static int somaNaturais(int n) {
		if(n<=0){
			 throw new IllegalArgumentException("numero menor que zero");
		}
		int i = 2;
		int s = 1;

		while (i <= n) {
			s = s + i;
			i++;
		}
		return s;
	}

	/**
	 * @param a
	 *            número de parcelas
	 * @param b
	 *            valor da parcela
	 * @param i
	 *            variável de iteração
	 * @param s
	 *            variável de soma
	 * 
	 * @return resultado do produto
	 */
	public static int produto(int a, int b) {
		if(a<=0 || b<=0){
			 throw new IllegalArgumentException("numero menor que zero");
		}
		int totalParcelas = a;
		int parcela = b;
		if (b < a) {
			totalParcelas = b;
			parcela = a;
		}

		int i = 1;
		int s = 0;
		while (i <= totalParcelas) {
			s = s + parcela;
			i++;
		}
		return s;
	}

	/**
	 * @param x
	 *            número natural
	 * @param y
	 *            valor da potencia
	 * @param i
	 *            variável de iteração
	 * @param potencia
	 *            variável para valor de potencia
	 * 
	 * @return resultado da potencia
	 */
	public static int potencia(int x, int y) {
		if(x<=0 || y<=0){
			 throw new IllegalArgumentException("numero menor que zero");
		}
		int potencia = 1;
		int i = 1;
		while (i <= y) {
			potencia = produto(potencia, x);
			i++;
		}
		return potencia;
	}

}
