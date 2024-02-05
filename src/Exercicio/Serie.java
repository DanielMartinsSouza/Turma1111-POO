package Exercicio;

import java.util.List;

public class Serie {
    List<String> elenco;
    List<Integer> episodios;
    List<Integer> temporadas;
    String nomeSerie;

    void selecionarEpisodio(Integer episodioSelecionado){
        for (Integer episodio : this.episodios){
            if (episodio.equals(episodioSelecionado)){
                this.assistir();
            }
        }
    }

    void selecionarTemporada(Integer episodioSelecionado){
        for (Integer episodio : this.episodios){
            if (episodio.equals(episodioSelecionado)){
                this.selecionarEpisodio(1);
            }
        }
    }

    private void assistir() {}


}
