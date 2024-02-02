//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.numero = 135486;
        contaBancaria.agencia = 5511;
        contaBancaria.tipo = "PF";
        contaBancaria.saldo = 10000;
        contaBancaria.titular = "Daniel";

//        System.out.println(contaBancaria.titular);

        double valorSaque = 20000;
        contaBancaria.sacar(valorSaque);


        double valorDeposito = 5000;
        contaBancaria.depositar(valorDeposito);

//        ContaBancaria contaBancaria2 = contaBancaria;
        ContaBancaria contaBancaria2 = new ContaBancaria();

//        System.out.println(contaBancaria2.titular);

//        System.out.println(contaBancaria);
//        System.out.println(contaBancaria == contaBancaria2);
        contaBancaria2.saldo = 15000;
        System.out.println(contaBancaria.saldo);
        System.out.println(contaBancaria2.saldo);

        System.out.println(contaBancaria.transferir(5000, contaBancaria2));

        System.out.println(contaBancaria.saldo);
        System.out.println(contaBancaria2.saldo);

    }
}