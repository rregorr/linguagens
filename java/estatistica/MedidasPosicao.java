import java.util.*;

public class MedidasPosicao {
    public static ArrayList<Integer> Ordenar (ArrayList<Integer> numeros) {
      for (int i = 0; i < numeros.size() - 1; i++) {  
        for (int j = 0; j < numeros.size() - i - 1; j++) {
          if (numeros.get(j) > numeros.get(j + 1)) {
            int temp = numeros.get(j);
            numeros.set(j, numeros.get(j+1));
            numeros.set(j+1, temp);
          }
         } 
      } return numeros; 
    } 
  
    // public static Moda () {

    // }

    // public static int Mediana () {

    // }

   // public static int Separatrizes () {
      /* Cálculo dos quartis: 
       * 1) Ordenar os numeros; 2) obter mediana (2o quartil ou q2); 3) Dividir em duas metades (quartil 1, q1 
       * e quartil 2, q2). Para traçar o boxblot, bigode começa no limite inferior e termina no superior
       * extremidade esquerda da caixa é q1, centro é q2 e extremidade direita é q3.
       */
  //  }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Informe a lista de números:");
       
        while (true) {
          int numero = sc.nextInt();
          if (numero == -1) {
            break;
          }
          lista.add(numero);
        }
        
        ArrayList<Integer> listaOrdenada = Ordenar(lista);

        System.out.println("Números ordenados: " + listaOrdenada);
    }    
}