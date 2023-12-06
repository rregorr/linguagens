import java.util.Scanner;

public class Fibonacci {
 public static void main(String[] args) {

 int a = 0, b = 1, c = 0, contador = 2;
 System.out.println("Forneça um número inteiro maior que zero");
 Scanner sc = new Scanner(System.in);
 int numero = sc.nextInt();

while (contador <= numero) {
 if (numero > 0) {
  if (numero == 1) {
   System.out.println(0);
  }
  else if (numero == 2) {
   System.out.println(1);
  } 
  
  else {
   a = 0;
   b = 1;
   c = a + b;
   a = b;
   contador++;
   System.out.println(c);
  }
 }
}
}
}

/* https://wagnergaspar.com/exercicio-5-imprimir-o-enesimo-termo-da-sequencia-de-fibonacci-com-fluxograma/
1 - a = 0; b = 1; c = a + b (0+1=1); 

a = b; b = c;;;

*/
