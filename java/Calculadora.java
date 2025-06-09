import java.util.*;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b; // Retorna a soma dos parâmetros a e b. O valor será usado por quem chamar esse
                      // método
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) { // public: o método pode ser chamado de fora da classe.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();
        sc.nextLine(); // limpar o enter pendente

        Calculadora calculadora = new Calculadora(); // nome da variável que irá armazenar o objeto.
        int resultado_soma = calculadora.somar(a, b);
        int resultado_subtracao = calculadora.subtrair(a, b);
        int resultado_multiplicacao = calculadora.multiplicar(a, b);
        int resultado_divisao = calculadora.dividir(a, b);

        while (true) {
            System.out.println("Digite a operação: ");
            String operacao = sc.nextLine();

            if (operacao.equals("+")) {
                System.out.println("Seguem os resultados: " + resultado_soma);
            }

            else if (operacao.equals("-")) {
                System.out.println("Seguem os resultados: " + resultado_subtracao);

            }

            else if (operacao.equals("*")) {
                System.out.println("Seguem os resultados: " + resultado_multiplicacao);

            }

            else if (operacao.equals("/")) {
                System.out.println("Seguem os resultados: " + resultado_divisao);

            }

            else {
                System.out.println("A aplicação será encerrada!");
                break;
            }

        }

        // "\n" + a + " - " + b + " = " + resultado_subtracao +
        // "\n" + a + " * " + b + " = " + resultado_multiplicacao +
        // "\n" + a + " / " + b + " = " + resultado_divisao);

    }

}
