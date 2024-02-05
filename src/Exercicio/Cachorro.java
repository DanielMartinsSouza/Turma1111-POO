package Exercicio;

import java.util.List;

public class Cachorro {
    String cor;
    String nome;
    String raca;
    String porte;
    List<String> estado;
    void latir(){}

    void correr(){
        this.estado.add("Cansado");
    }

    void brincar(){
        this.correr();
        this.estado.add("Feliz");
    }

    void dormir(){
        this.estado.remove("Cansado");
    }

    void triste(){
        this.estado.remove("Feliz");
    }
}
