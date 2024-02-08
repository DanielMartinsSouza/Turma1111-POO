package Aula0702.Exercicio03;

public class Autor {
    String nome;
    String nacionalidade;
    String dataNascimento;

    public Autor(String nome, String nacionalidade, String dataNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
