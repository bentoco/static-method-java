package Exercicio_Contador;

public class Contador {
    public static int valor;

    public Contador() {
        valor++;
    }

    public static void incrementar() {
        valor++;
    }

    // quando a propriedade é obrigatória, ou seja, o valor nunca será nulo utilizamos os tipos Primitivos (int, double)
    // caso seja opcional devemos utilizar o Wrapper (Integer, Double)
    // primitivo (valor = 0;) | wrapper (valor = null;)
    public static void zerar() {
        valor = 0;
    }

    public static int getValor() {
        return valor;
    }
}
