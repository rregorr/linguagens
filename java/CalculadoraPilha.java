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
import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraPilha {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> armazenaNumeros = new ArrayList<>();

    public int somar(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
        num1 = 3; num2 = 5; num3 = 7; num4 = 11; num5 = 13; num6 = 17; num7 = 19;

        int soma = num1 + num2 + num3 + num4 + num5 + num6 + num7;
        armazenaNumeros.add(num1); armazenaNumeros.add(num2);
        armazenaNumeros.add(num3);
        armazenaNumeros.add(num4);
        armazenaNumeros.add(num5);
        armazenaNumeros.add(num6);
        armazenaNumeros.add(num7);
        return soma;
    }
    //Método que remove o número do topo da lista
    public int removerTopo() {
        return armazenaNumeros.remove(armazenaNumeros.size()-1);
    }

    //Método que remove o número correspondente ao indice informado da lista
    public int removerIndice(int indice) {
    if (indice >= 0 && indice < armazenaNumeros.size()) {
        return armazenaNumeros.remove(indice);
    } else {
        System.out.println("Índice inválido.");
        return -1;
    }
}
    //Método que remove o número informado, caso exista na lista
    public int removerNumero(int numero) {
    if (armazenaNumeros.contains(numero)) {
        armazenaNumeros.remove(Integer.valueOf(numero));
        System.out.println(numero);
        return numero;
    } else {
        System.out.println("Número não encontrado na lista.");
        return -1;
    }
}
    //Método que retorna o número cujo índice é informado, caso exista na lista
 public int retornaIndice(int indice) {
    if (indice >= 0 && indice < armazenaNumeros.size()) {
        return armazenaNumeros.get(indice);
    } else {
        System.out.println("Índice inválido.");
        return -1; // valor padrão de erro
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(1,1,1,1,1,1,1);
        System.out.println(soma);
        System.out.println("Lista de números completa: " + calculadora.armazenaNumeros);

        int removeTopo = calculadora.removerTopo();
        System.out.println("Número do topo removido: " + removeTopo);
        System.out.println("Agora a lista contém os seguintes elementos: " + calculadora.armazenaNumeros);
        System.out.println("Informe um índice, cujo número deseja remover:");
        int indice = sc.nextInt();
        calculadora.removerIndice(indice);
        System.out.println("A lista agora contém os números: " + calculadora.armazenaNumeros);

        System.out.println("Informe um número que deseja remover:");
        int numero = sc.nextInt();
        calculadora.removerNumero(numero);
        System.out.println("A lista agora contém os números: " + calculadora.armazenaNumeros);

        System.out.println("Informe um indice para retornar o número correpondente:");
        int indice2 = sc.nextInt();
        int retornaIndice = calculadora.retornaIndice(indice2);
        System.out.println("O número correspondente ao índice informado é: " + retornaIndice);
    }

}