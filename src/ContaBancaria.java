public class ContaBancaria {
    int numero;
    int agencia;
    String tipo;
    double saldo;
    String titular;


    boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    void depositar(double valor) {
        this.saldo += valor;

    }

    boolean transferir(double valor, ContaBancaria outraConta) {
        //this.saldo -= valor;
        //outraConta += valor;
        if (this.sacar(valor)) {
            outraConta.depositar(valor);
            return true;
        }else {
            return false;
        }

    }
}
