package Exercicio_Galinha;

public class GalinhaTest {
    public static void main(String[] args) {
        Galinha g1 = new Galinha();
                g1.botar().botar().botar();

        Galinha g2 = new Galinha();
                g2.botar().botar();

        System.out.println("Galinha 1 botou o total de " + g1.ovos + " ovos.");
        System.out.println("Galinha 2 botou o total de " + g2.ovos + " ovos.");
        System.out.println("A granja possui o total de " + Galinha.ovosGranja + " ovos.");
        System.out.println("A granja possui a média de " + Galinha.mediaOvosPorGalinha(2) + " ovos por galinha.");
    }
}
