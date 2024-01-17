import java.util.*;

public class MDC {
    public static int CalculaMDC(int numero1, int numero2) {
        int maior = Math.max(numero1, numero2);
        int menor = Math.min(numero1, numero2);

        // Encontra o MDC usando um loop decrescente
        for (int i = menor; i >= 1; i--) {
            if (maior % i == 0 && menor % i == 0) {
                return i; // Retorna o MDC assim que for encontrado
            }
        }
        return 1; // Se nenhum outro divisor comum for encontrado, retorna 1
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número 1:");
	int numero1 = sc.nextInt();
        System.out.println("Insira o número 1:");
	int numero2 = sc.nextInt();
        System.out.println("O MDC dos dois números é: " + CalculaMDC(numero1, numero2));
    }
}
