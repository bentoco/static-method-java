package Exercicio.Conversor;

public class ConversorArea {
    public static double metroQuadrado = 10.76;
    public static int peQuadrado = 929;
    public static int milhaQuadrada = 640;
    public static double acre = 43560.00;

    public static double converterMetroQuadrado(double num) {
        return num * metroQuadrado;
    }

    public static double converterPeQuadrado(double num) {
        return num * peQuadrado;
    }

    public static double converterMilhaQuadrada(double num) {
        return num * milhaQuadrada;
    }

    public static double converterAcre(double num) {
        return num * acre;
    }
}
