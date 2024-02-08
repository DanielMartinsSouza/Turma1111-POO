package Aula0702.Exercicio03;

import java.util.ArrayList;

public class Animal {
    String nome;
    String especie;
    ArrayList<Dono> donos;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
        this.donos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", donos=" + donos +
                '}';
    }
}
