import java.util.*;
/* 
Éuma coleção que não permite elementos duplicados e não mantém a ordem dos elementos. É uma implementação da interface 
Características:
- Não garante a ordem dos elementos.
- Permite no máximo um valor null.
- É não sincronizado (não é thread-safe).
O HashSet é uma boa escolha quando você precisa de uma coleção sem duplicatas e a ordem dos elementos não é importante. É uma das coleções mais utilizadas 
em Java para armazenar conjuntos de elementos únicos.
*/

public class JHashSet {
	public static HashSet<Integer> Calcula() {
		HashSet<Integer> hs = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int numero = 1;

		while (numero >= 0) {
			System.out.println("Forneca um numero: ");
			numero = sc.nextInt();
			hs.add(numero);
		}
		return hs;
	}
	public static void main (String[] args) {
		HashSet<Integer> hs = Calcula();
		hs.add(1);
		System.out.println("Números fornecidos: " + hs);
	}
}
