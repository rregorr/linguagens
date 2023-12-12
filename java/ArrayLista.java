import java.util.Scanner;
import java.util.ArrayList; // Importação necessária

public class ArrayLista {
	public static ArrayList<Long> Calcula() {
		ArrayList<Long> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		for (int i = 0; i <= 10; i++) {
			cont++;
			System.out.println("Informe um número");
			long numero = sc.nextLong();
			while (numero != -1) {
				System.out.println("Informe um número");
				lista.add(numero);
		                numero = sc.nextLong(); // Apenas atualizar o valor

			}
		
		}return lista;
	} 
	
	public static void main(String[] args) {
		ArrayList<Long> resultado = Calcula();
		System.out.println("Resultado: " + resultado);
	}
}