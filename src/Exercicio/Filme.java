package Exercicio;

import java.util.List;

public class Filme {

    String nomeFilme;
    double duração;
    List<String> elenco;
    void verElenco(){
        for (String pessoa : this.elenco){
            System.out.println(pessoa);
        }
    }

    void pausar(){}
    void retomar(){}
    private void assistir() {}

}
