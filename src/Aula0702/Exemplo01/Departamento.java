package Aula0702.Exemplo01;

import java.util.ArrayList;

public class Departamento {
    String nome;
    ArrayList<Professor> professores;

    public Departamento(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nome='" + nome + '\'' +
                ", professores=" + professores +
                '}';
    }
}
