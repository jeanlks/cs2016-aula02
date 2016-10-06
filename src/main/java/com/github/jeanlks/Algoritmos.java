package com.github.jeanlks;

/**
 * Algoritmos definidos como exercicio para aula2.
 * @author Jean
 */
public final class Algoritmos {
/**
 * @param n
 *            número que se deseja saber a soma dos naturais
 *
 * @return soma dos números naturais até n
 */
public static int somaNaturais(final int n) {
if (n <= 0) {
   throw new IllegalArgumentException("numero <0");
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
    *
    * @return resultado do produto
  */
public static int produto(final int a, final int b) {
    if (a <= 0 || b <= 0) {
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
 *
 * @return resultado da potencia
*/
public static int potencia(final int x, final int y) {
     if (x <= 0 || y <= 0) {
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
/**
* @param n
*            número para calculo
* @return
*resultado booleano se o valor corresponde ou nao a propriedade
*   3025
*/
public static boolean propriedade3025(final int n) {
    final int valorDivisao = 100;
    final int limite = 9999;
    if (n <= 0 || n >= limite) {
       throw new IllegalArgumentException("numero <0 ou >9999");
    }
    int i = n / valorDivisao;
    int j = n % valorDivisao;

return n == potencia(i + j, 2);
}

/**
* @param n
 *            número para calculo
 * @return
 * resultado booleano se o valor corresponde ou nao a propriedade
 *         153
 */
public static boolean propriedade153(final int n) {
    final int valorEstipulado = 100;
    final int valorPropriedade = 3;
    final int limite = 9999;
    final int valorDivisao = 10;
    if (n <= 0 || n >= limite) {
      throw new IllegalArgumentException("numero <0 ou >9999");
    }
    int i = n / valorEstipulado;
    int j = (n - (valorEstipulado * i)) / valorDivisao;
    int k = n % valorDivisao;
return n == (potencia(i, valorPropriedade)
            + potencia(j, valorPropriedade)
           + potencia(k, valorPropriedade));
}

/**
 * @param n
 *            número para calculo
 * @return resultado booleano se o valor corresponde ou nao a um numero
 *         primo
 */

public static boolean primo(final int n) {
     if (n < 1) {
       throw new IllegalArgumentException("numero menor que 1");
     }

     int i = 2;
    while (i <= (n - 1)) {
     if (n % i == 0) {
     return false;
   }
   i++;
  }
return true;
}

/**
 * @param n
 *            número para calculo
 * @return resultado retorna o numero harmonico
 */
public static int numeroHarmonico(final int n) {
     if (n < 1) {
        throw new IllegalArgumentException("numero menor que 1");
    }
    int i = 2;
    int s = 1;
   while (i <= n) {
    s = s + (1 / i);
    i++;
   }
return s;
}
/**
* Restringe criação de instância.
*/
private Algoritmos() {
}

}
