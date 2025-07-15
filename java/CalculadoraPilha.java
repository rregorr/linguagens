/*Operação e Complexidade
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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class CalculadoraPilha {
    Scanner sc = new Scanner(System.in);
    Deque<Integer> numeros = new LinkedList<>(); 

    public Deque<Integer> empilhar () {
        System.out.println("Informe próximo número da pilha ou -1 para sair!");
        int num = sc.nextInt();
        
        while (num != -1) {
            numeros.push(num);
        System.out.println("Informe próximo número da pilha ou -1 para sair!");
            num = sc.nextInt();
        }
        System.out.println("Apos o empilhamento, Agora a lista contém os seguintes elementos: ");
        return numeros;
    }
    //Método que remove o número do topo da lista
    public Deque<Integer> removerTopo() {
        int topo = numeros.pop();
        System.out.println("Apos a remoção do topo ("+topo+"), a lista contém os seguintes elementos: ");
        return numeros;
    }

    //Método que remove o número informado, caso exista na lista
    public Deque<Integer> removerNumero() {
        System.out.println("Informe o número que quer remover:");
        int numeroRemover = sc.nextInt();
    if (numeros.contains(numeroRemover)) {
        boolean removido = numeros.remove(Integer.valueOf(numeroRemover)); // Remove o objeto Integer
        if (removido) {
            System.out.println(numeroRemover + " removido com sucesso!");

        } else {
            System.out.println("Erro ao remover!");

        }

    } else {
        System.out.println("Número não encontrado na lista.");

    }
    System.out.println("Apos a remoção de " + numeroRemover + ", Agora a lista contém os seguintes elementos: ");
    return numeros;
}

public int somarPilha() {
    int totalPilha = 0;
    for (int num : numeros) {
        totalPilha += num;
    }
    System.out.println("A soma de todos os números na pilha é: " + totalPilha);
    return totalPilha;
}
   
    public static void main(String[] args) {
        CalculadoraPilha calculadora = new CalculadoraPilha();
        
        //Empilhar
        calculadora.empilhar();
        
        //Somar
        calculadora.somarPilha();

       //Remover topo
       calculadora.removerTopo();
        
        //Remover um número
        calculadora.removerNumero();

    }

    
}