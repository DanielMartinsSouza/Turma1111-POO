package Exercicio;

import java.util.List;

public class Computador {
    List<String> io;
    int memoria;
    int armazenamento;
    String processador;
    String estadoDoComputador;

    void alterarEstado(String estado){
        this.estadoDoComputador = estado;
    }

    void conectarDispositivoDeIO(String dispositivo){
        this.io.add(dispositivo);
    }

    void removerDispositivoDeIO(String dispositivo){
        this.io.remove(dispositivo);
    }
}
