package com.github.jeanlks;

public class Algoritmo2 {
	public static int somaNaturais(int n) {
		int i = 2;
		int s = 1;
		
		while (i <= n) {
			s = s + i;
			i++;
		}
		return s;
	}

	
}
