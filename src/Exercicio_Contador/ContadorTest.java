package Exercicio_Contador;

public class ContadorTest {
    public static void main(String[] args) {
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        System.out.println("Total: " + Contador.getValor());
        Contador.zerar();
        System.out.println("Total: " + Contador.getValor());
    }
}
