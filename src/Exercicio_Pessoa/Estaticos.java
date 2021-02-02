package Exercicio_Pessoa;

public class Estaticos {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa a = new Pessoa();
        a.setIdade(17);
        p.setIdade(19);

        // com método não estático
        System.out.println("Não Estático");
        System.out.println(p.isMaiorIdade());
        System.out.println(a.isMaiorIdade());

        // com método estático
        System.out.println("\nEstático");
        System.out.println(Pessoa.isMaiorIdade2(p));
        System.out.println(Pessoa.isMaiorIdade2(a));
    }
}
