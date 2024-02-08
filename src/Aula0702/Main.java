package Aula0702;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua teste", "185", "14154448", "Teste", "StzTesete", "SP");
        Endereco endereco2 = new Endereco("Rua teste", "185", "14154448", "Teste", "StzTesete", "SP");
        Endereco endereco3 = new Endereco("Rua teste", "185", "14154448", "Teste", "StzTesete", "SP");
        Contato contato = new Contato("Duga", "554633215", "teste@testando.com.br", "15/01/2024");


        contato.enderecos.add(endereco);
        contato.enderecos.add(endereco2);
        contato.enderecos.add(endereco3);

        System.out.println(contato);
    }
}
