/*
Arranjo Simples: Usado para encontrar o número de maneiras de escolher e organizar um subconjunto de itens de um conjunto maior. A fórmula é:
A(n,k)= n!/(n−k)!
n!
​*/

import java.util.*;
public class AnaliseCombinatoria {

	int n, k;
	public static int PermutacaoSimples(int n) {
		for (int i = n-1; i <= n; i--) {
			if (i > 0) {
				n = n*i;
			}
		} 
		return n;	
	}
 
	

	public static void int PermutacaoComRepeticao() {

	}
/*
	public static int CombinacaoSimples() {
		
	}
	public static int CombinacaoComRepeticao() {
	
	}*/
}

	public static void main (String[] args) {
		System.out.println("Informe um número: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//PermutacaoSimples(n);
		//PermutacaoComRepeticao();
		System.out.println("Fatorial de " + n + " é " + PermutacaoSimples(n));
		System.out.println("Fatorial de " + n + " é " + PermutacaoComRepeticao(5,3));
	}
}