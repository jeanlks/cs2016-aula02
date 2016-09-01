package com.github.jeanlks;
/**
 * Algoritmo 2 definido como exercicio para aula2. 
 */
public class Algoritmos {

	public static int somaNaturais(int n) {
		/**
		 * @param i serve para variável de iteração.
		 * @param s mantém a soma da conta a cada ciclo de i.
		 * @param n número que se deseja saber a soma dos naturais
		 * 
		 * @return s soma dos números naturais até n
		 */
		int i = 2;
		int s = 1;
		
		while (i <= n) {
			s = s + i;
			i++;
		}
		return s;
	}

	public static int produto(int a, int b) {
		/**
		 * @param a número de parcelas
		 * @param b valor da parcela
		 * @param i variável de iteração
		 * @param s variável de soma
		 * 
		 * @return s resultado do produto
		 */
		int totalParcelas = a;
		int parcela = b;
		if(b<a){
			totalParcelas = b;
			parcela = a;
		}
		
		int i = 1;
		int s = 0;
		while(i<=totalParcelas){
			s = s + parcela;
			i++;
		}
		return s;
	}
	
	public int potencia(int x, int y){
		int potencia = 1;
		int i = 1;
		while(i<=y){
			potencia = produto(potencia,x);
			i++;
		}
		return potencia;
	}
	
}
