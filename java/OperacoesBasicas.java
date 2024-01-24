public class OperacoesBasicas {
    public static int Soma (int a, int b) {
        return a + b;
    }

    public static int APotenciaB (int a, int b) {
        int APotenciaB = (int) Math.pow(a, b);
        return APotenciaB;
    }
    public static void main (String[] args) {
        int retorno = Soma(50, 0);
        int APotenciaB = APotenciaB(4,5);
        System.out.println("O valor de a mais b eh: " + retorno);
        System.out.println("O valor de a potencia b eh: " + APotenciaB);
    }
}
