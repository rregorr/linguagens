package src.main.java;
import java.util.Scanner;

public class Fibonacci {
  public static long CalculaFibonacci(int z) {
    
    long cont = 0;
    long a = 0;
    long b = 1;
    long c;

    if (z == 0) {
        System.out.println("A sequência Fibonacci para o número " + z + " é: 0");
    }

    else if (z == 1) {
        System.out.println("A sequência Fibonacci para o número " + z + " é: 01");
    }

    else {
      System.out.println("A sequência Fibonacci para o número " + z + " é: \n0\n1");

      while (cont <= z) {
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
    System.out.println("Informe um número: ");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();
  
    CalculaFibonacci(numero);
    
  }
}//
