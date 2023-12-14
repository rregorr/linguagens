/*

Lista Duplamente Encadeada: Cada elemento mantém referências ao elemento anterior e ao próximo.
Inserções e Remoções Eficientes: Adicionar ou remover elementos é geralmente mais rápido do que em um ArrayList, especialmente no meio da lista.
Acesso Direto mais Lento: O acesso a elementos específicos é mais lento, pois a lista precisa ser percorrida sequencialmente.
Uso de Memória: Cada elemento na LinkedList armazena dados e duas referências (anterior e próxima), o que significa que uma LinkedList pode usar
mais memória do que um ArrayList.

*/

import java.util.*;

public class JLinkedList {
	public static LinkedList<Integer> Calcula() {
		Scanner sc = new Scanner(System.in);		
		LinkedList<Integer> ll = new LinkedList<>();		

		while (true) {
			System.out.println("Forneça um número: ");
			int numero = sc.nextInt();
			if (numero==-1) {
				break;
			}
			else {
				ll.add(numero);
			}

		}
		return ll;	

	}

	public static void main (String[] args) {
		LinkedList<Integer> ll = Calcula();
		System.out.println(ll);	
	}
}