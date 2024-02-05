package Exercicio;

import java.util.List;

public class Livro {
    String editora;
    String titulo;
    Integer paginaAtual;
    List<Integer> paginas;

    void selecionarPagina(Integer paginaSelecionada){
        for (Integer pagina : this.paginas){
            if (pagina.equals(paginaSelecionada)) {
                paginaAtual = paginaSelecionada;
                break;
            }
        }
    }
}
