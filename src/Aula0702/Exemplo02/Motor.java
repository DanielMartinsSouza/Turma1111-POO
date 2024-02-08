package Aula0702.Exemplo02;

public class Motor {
    int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                '}';
    }
}
