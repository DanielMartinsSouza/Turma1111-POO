package Aula0702;

import java.util.ArrayList;

public class Contato {
    String nome;
    String telefone;
    String email;
    String dataNascimento;
    ArrayList<Endereco> enderecos;


    public Contato(String nome, String telefone, String email, String dataNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.enderecos = new ArrayList<Endereco>();
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", enderecos=" + enderecos +
                '}';
    }
}
