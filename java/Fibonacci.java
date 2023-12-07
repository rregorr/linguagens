package src.main.java;
import java.util.Scanner;

public class Fibonacci {
  public static long CalculaFibonacci(int z) {
    System.out.println("Informe um número: ");
    Scanner sc = new Scanner(System.in);
    long numero = sc.nextLong();
  
    long cont = 0;
    long a = 0;
    long b = 1;
    long c;

    if (numero == 0) {
        System.out.println("A sequência Fibonacci para o número " + numero + " é: 0");
    }

    else if (numero == 1) {
        System.out.println("A sequência Fibonacci para o número " + numero + " é: 01");
    }

    else {
      System.out.println("A sequência Fibonacci para o número " + numero + " é: \n0\n1");

      while (cont <= numero) {
        c = a + b; 
        a = b; 
        b = c;
        cont++;
        
        System.out.println(b);
    }
    }
    return b;
  }
  public static void main (String[] args) {
    CalculaFibonacci(20);
    
  }
}
