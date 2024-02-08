package Aula0702.Exemplo02;

public class Main {
    public static void main(String[] args) {
        int potenciaMotor = 70;
        Carro carro = new Carro(potenciaMotor);
        Pneu pneu1 = new Pneu(30);
        Pneu pneu2 = new Pneu(30);
        Pneu pneu3 = new Pneu(30);
        Pneu pneu4 = new Pneu(30);
        Pneu pneu5 = new Pneu(30);

        carro.pneus.add(pneu1);
        carro.pneus.add(pneu2);
        carro.pneus.add(pneu3);
        carro.pneus.add(pneu4);
        carro.pneus.add(pneu5);

        System.out.println(carro);
    }
}
