package src.main.java;
import java.util.Scanner;

public class Fibonacci {
  //public static long CalculaFibonacci(int n) {

    
    long cont = 0;
    long a = 0;
    long b = 1;
    long c;

    if (n < 0) {
	System.out.println("A sequência Fibonacci não admite números negativos");
    }	

    else if (n == 0) {
        System.out.println("A sequência Fibonacci para o número " + n + " é: 0");
    }

    else if (n == 1) {
        System.out.println("A sequência Fibonacci para o número " + n + " é: 0, 1");
    }

    else {
      System.out.println("A sequência Fibonacci para o número " + n + " é: \n0\n1");

      while (cont < n) {
        cont++;
        c = a + b; 
        a = b; 
        b = c;
       
        System.out.println(b);
    }
    }
    return b;
  }
  public static void main (String[] args) {
    System.out.println("Informe um número: ");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
  
    CalculaFibonacci(numero);
    
  }
}
