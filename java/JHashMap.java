/*
Conceitos de HashMap:
Armazenamento Baseado em Chave-Valor: HashMap armazena elementos em pares chave-valor. Cada chave é única e mapeia para exatamente um valor.
Alta Eficiência: Oferece acesso rápido a valores com base em chaves. Ideal para situações onde é necessário buscar frequentemente valores associados a chaves específicas.
Sem Ordem Garantida: Não mantém a ordem de inserção dos elementos.
Permite Chave e Valor Null: Pode conter uma chave null e vários valores null.

*/

import java.util.*;

public class JHashMap {
	public static HashMap<String, Integer> Calcula() { //método estático chamado Calcula, que retorna um HashMap<String, Integer>
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<>();
		int numero = 1;
		
		while(true) {
			System.out.println("Informe uma chave válida, ou 'x' para sair");
			String chave = sc.nextLine();
			if (chave.equals("x")) {
				System.out.println("Encerrando o programa!");
				break;
			}
			else {
				System.out.println("Informe um número");
				numero = sc.nextInt();
				sc.nextLine();
				hm.put(chave, numero);
			}
		}
		
		return hm;	
	} 

	//O ponto de entrada do programa. Chama o método Calcula e imprime o HashMap resultante.
	public static void main (String[] args) {
		HashMap<String, Integer> hm = Calcula();
		System.out.println("Número fornecidos, são: " + hm);
	}
}