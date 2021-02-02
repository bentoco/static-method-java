package Exercicio_Pessoa;

public class Pessoa {
    private String nome;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public boolean isMaiorIdade() {
        return idade >= 18;
    }

    public static boolean isMaiorIdade2(Pessoa pessoa) {
        return pessoa.getIdade() >= 18;
    }
}
