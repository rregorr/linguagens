public class Mdc {
    public static int MDCdue(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
        
    }

/* Codifique um(a) método/função intitulado(a) MDCmulti que calcule e retorne o MDC de um conjunto de números, ou seja, 
o maior (máximo) número que divide simultaneamente todos os números do conjunto fornecido. A função, ou método, 
recebe apenas um parâmetro, na forma de um array, contendo dois ou mais números inteiros, positivos e diferentes de 
zero. Esse parâmetro não deve ser validado, pois supostamente estará sempre correto. 
Uma dica útil: MDC(a,b,c) = MDC(MDC(a,b), c).
 */
    public static int MDCMulti(int[] numbers) {
       int result = numbers[0];
       for (int i = 1; i < numbers.length; i++) {
            result = MDCdue(result, numbers[i]);
       }
       return result;
    }

    public static void main(String[] args) {
       int[] numbers = {48, 64, 80};
       System.out.println(MDCMulti(numbers));
    }
}