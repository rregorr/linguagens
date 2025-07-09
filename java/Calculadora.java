import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> armazenaNumeros = new ArrayList<>();

    public int somar(int num1, int num2, int num3, int num4, int num5) {
        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        num3 = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        num4 = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        num5 = sc.nextInt();

        int soma = num1 + num2 + num3;
        armazenaNumeros.add(num1);
        armazenaNumeros.add(num2);
        armazenaNumeros.add(num3);
        armazenaNumeros.add(num4);
        armazenaNumeros.add(num5);
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
        int soma = calculadora.somar(3,2,0,4, 5);
        System.out.println(soma);
        System.out.println("Lista de números completa: " + calculadora.armazenaNumeros);

        int removeTopo = calculadora.removerTopo();
        System.out.println("Número do topo removido: " + removeTopo);
        System.out.println("Agora a lista contém os seguintes elementos: " + calculadora.armazenaNumeros);
        System.out.println("Informe um índice, cujo número deseja remover:");
        int indice = sc.nextInt();
        int removeIndice = calculadora.removerIndice(indice);
        System.out.println("A lista agora contém os números: " + calculadora.armazenaNumeros);

        System.out.println("Informe um número que deseja remover:");
        int numero = sc.nextInt();
        int removeNumero = calculadora.removerNumero(numero);
        System.out.println("A lista agora contém os números: " + calculadora.armazenaNumeros);

        System.out.println("Informe um indice para retornar o número correpondente:");
        int indice2 = sc.nextInt();
        int retornaIndice = calculadora.retornaIndice(indice2);
        System.out.println("O número correspondente ao índice informado é: " + retornaIndice);
        System.out.println("A lista agora contém os números: " + calculadora.armazenaNumeros);
    }

}