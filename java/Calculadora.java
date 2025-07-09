import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> armazenaNumeros = new ArrayList<>();

    public int somar(int num1, int num2, int num3) {
        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        num3 = sc.nextInt();

        int soma = num1 + num2 + num3;
        armazenaNumeros.add(num1);
        armazenaNumeros.add(num2);
        armazenaNumeros.add(num3);
        return soma;
    }
    //Método que remove o número do topo da lista
    public int removerTopo() {
        return armazenaNumeros.remove(armazenaNumeros.size()-1);
    }

    //Método que remove o número correspondente ao indice informado da lista
    public int removerIndice(int indice) {
        System.out.println("Informe o índice do número a remover:");
        int leIndice = sc.nextInt();
        return armazenaNumeros.remove(leIndice);
    }

    //Método que remove o número informado, caso exista na lista
    public int removerNumero (int numero) {
        System.out.println("Informe o número a remover: ");
        int leNumero = sc.nextInt();
        if (armazenaNumeros.contains(leNumero)) {
            armazenaNumeros.remove(Integer.valueOf(leNumero));
            return leNumero;
        } else {
            System.out.println("A lista não contém o número informado");
            return -1;
        }
        
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(3,2, 5);
        System.out.println(soma);
        System.out.println("Lista de números completa: " + calculadora.armazenaNumeros);

        int removeTopo = calculadora.removerTopo();
        System.out.println("Número do topo removido: " + removeTopo);

        int removeIndice = calculadora.removerIndice(1);
        System.out.println("A lista agora contém os números: " + calculadora.armazenaNumeros);

        int removeNumero = calculadora.removerNumero(0);
        System.out.println("A lista agora contém os números: " + calculadora.armazenaNumeros);
    }

}