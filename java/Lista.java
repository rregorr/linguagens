import java.util.*;
public class Lista {
	public static ArrayList<Integer> Calcula() {
		int numero = 1;
		Scanner sc = new Scanner(System.in);
		ArrayList lista = new ArrayList<>();
		
		while (numero > 0) {
			System.out.println("Forneça um número");
			numero = sc.nextInt();
			lista.add(numero);
		}
		return lista;
	}
	public static void main (String[] args) {
		ArrayList<Integer> resultado =	Calcula();
		System.out.println(resultado);
	
	} 
}