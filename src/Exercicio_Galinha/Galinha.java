package Exercicio_Galinha;

public class Galinha {
    public int ovos; // quantidade de ovos pertencentes ao objeto
    public static int ovosGranja; // quantidade de ovos pertencentes a classe, várivel que contém valor global

    public Galinha botar() {
        this.ovos++;
        ovosGranja++;
        return this;
    }

    public static double mediaOvosPorGalinha(int galinhas) {
        return ovosGranja / galinhas;
    }

}
