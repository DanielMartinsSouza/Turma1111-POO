package Aula0702.Exemplo01;

public class Professor {
    String nome;
    String materia;

    public Professor(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }
}
