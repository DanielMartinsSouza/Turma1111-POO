package Aula0702.Exercicio03;

import java.util.ArrayList;

public class Telefone {
    String modelo;
    String marca;
    ArrayList<Carregador> carregadores;

    public Telefone(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.carregadores = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", carregadores=" + carregadores +
                '}';
    }
}
