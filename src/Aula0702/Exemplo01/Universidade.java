package Aula0702.Exemplo01;

import java.util.ArrayList;

public class Universidade {
    String nome;
    ArrayList<Departamento> departamentos;

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Universidade{" +
                "nome='" + nome + '\'' +
                ", departamentos=" + departamentos +
                '}';
    }
}
