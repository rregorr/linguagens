import java.util.ArrayList;

public class Cadastro {
  public static void main(String[] args) {
    //Array não podem ser alterados em tempo de execução
    String[] nomes_array = {"Rogerio", "Lorenna" , "Java", "Heitor"};

    System.out.println("\nNome da família usando Array: ");
    for (String nome : nomes_array) {
      System.out.println(nome);
    }
    System.out.println("\nNome da família usando ArrayList: ");
    //Para suprir o problema dos Arrays, usamos Arraylists
    ArrayList<String> nomes_arraylist = new ArrayList<>();
    nomes_arraylist.add("Rogerio Lima");
    nomes_arraylist.add("Java Maria");

    int[][] idades = {{10,20},{20,30}};

    for (String nome_arraylist : nomes_arraylist) {
       System.out.println(nome_arraylist);      
    }
    System.out.printf("%5d%30d%n", 5, 10);
    
    for (int[] idade : idades) {
      System.out.println("Idade no Array Bidimensional: " + idade);
    }
  }
}