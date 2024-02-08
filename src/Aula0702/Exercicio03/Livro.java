package Aula0702.Exercicio03;

import java.util.ArrayList;

public class Livro {
    String titulo;
    String editora;
    ArrayList<Autor> autores;

    public Livro(String titulo, String editora) {
        this.titulo = titulo;
        this.editora = editora;
        this.autores = new ArrayList<>();
    }
}
