import java.util.*;
public class TesteAnaliseCombinatoria {

	int n, k;
	public static int PermutacaoSimples(int n) {
		for (int i = n-1; i <= n; i--) {
			if (i > 0) {
				n = n*i;
			}
		} return n;
	}
			

	public static void main (String[] args) {
		System.out.println("Informe um número: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//PermutacaoSimples(n);
		//PermutacaoComRepeticao();
		System.out.println("Fatorial de " + n + " é " + PermutacaoSimples(n));
	}
}