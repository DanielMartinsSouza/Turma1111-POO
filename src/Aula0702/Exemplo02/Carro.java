package Aula0702.Exemplo02;

import java.util.ArrayList;

public class Carro {
    Motor motor;
    ArrayList<Pneu> pneus;

    public Carro(int potencia) {
        this.motor = new Motor(potencia);
        this.pneus = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + motor +
                ", pneus=" + pneus +
                '}';
    }
}
