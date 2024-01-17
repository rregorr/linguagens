import java.util.*;

public class Rlm {
  public static int EntradaUsuario() {
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
    return numero;
  }
  public static int PermutacaoSimples(int a) {
    for (int i = a; i > 1; i--) {
      a = a * (i - 1);
    }
    return a;
  }

  public static int PermutacaoRepeticao() {
    int a = 555;
    return a;
  }

  public static void main(String[] args) {
    System.out.println("\n\nSelecione o cálculo de RLM que você quer praticar: ");
    System.out.println("\nPermutação Simples(1);\n Permutação com Repetição(2);\n Arranjo Simples(3);\n Arranjo com Repetiação(4);\n");
    Scanner sc = new Scanner(System.in);
    int opcao = sc.nextInt();
    int numero, resultado;

    switch (opcao) {
      case 1:
        System.out.println("Você selecionou a opção Permutação Simples.");
        System.out.println("Digite um valor:\n");
        numero = EntradaUsuario();
        resultado = PermutacaoSimples(numero);
        System.out.println("Resultado da permutação simples é: " + resultado);

      break;
      case 2:
        int valorRetornado = PermutacaoRepeticao();
        System.out.println("Você selecionou a opção Permutação com Repetição.");
        System.out.println("Numero inserido: " + valorRetornado);
        break;
    }
  }
}
