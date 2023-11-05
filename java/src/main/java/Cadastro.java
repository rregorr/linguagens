package src.main.java;

public class Cadastro {
    private String[] nomes = {"Rogerio", "Lorenna", "Java", "Heitor"};

    public String getNomeDaFamilia() {
        return nomes[0]; // Retorna o primeiro nome da array.
    }

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        System.out.println("Nome da família: " + cadastro.getNomeDaFamilia());
    }
}
