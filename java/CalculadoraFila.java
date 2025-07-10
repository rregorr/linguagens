
/*
5 Estruturas de dados e algoritmos. 5.1 Estruturas de dados: listas, filas, pilhas e árvores. 
5.2 Métodos de acesso, busca, inserção e ordenação em estruturas de dados. 5.3 Complexidade de algoritmos.

Operação e Complexidade
Acesso por índice, Inserção, Remoção no final: O(1)
Remoção no meio/início, Busca por valor	O(n)

Lista Ligada
Operação e Complexidade
Acesso por índice, Inserção no meio, Remoção no final, Busca por valor:	O(n)
Inserção/Remoção no início:	O(1)
Inserção no final	O(1)* ou O(n)
*Se a lista for duplamente encadeada com ponteiro para o final, a inserção no final pode ser O(1). 
 Caso contrário, é O(n) porque precisa percorrer.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraFila {
    ArrayList<Integer> fila = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void enfileirar (int numero) {
        fila.add(numero);
        System.out.println("Numero " + numero + " adicionado(s) à fila");
    }

    public void desenfileirar (int numero) {
        fila.remove(0);
    }

    public void ExibirFila() {
        System.out.println("Os elementos contidos na fila, são: " + fila);
    }

    public static void main(String[] args) {
        CalculadoraFila fila = new CalculadoraFila();
        fila.enfileirar(5);
        fila.enfileirar(3);
        fila.enfileirar(1);
        fila.enfileirar(0);
        fila.enfileirar(11);

        fila.ExibirFila();
     //   System.out.println("A fila agora contém os seguintes números: " + fila.);

        fila.desenfileirar(0);
        
        fila.ExibirFila();

    }
}