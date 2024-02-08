package Aula0702.Exemplo01;

public class Main {
    public static void main(String[] args) {
        Universidade uniTeste = new Universidade("UniTeste");

        Departamento cienciasExatas = new Departamento("Ciencia Exatas");
        Departamento cienciasHumanas = new Departamento("Ciencia Humanas");

        uniTeste.departamentos.add(cienciasExatas);
        uniTeste.departamentos.add(cienciasHumanas);

        Professor professor = new Professor("Duga", "Matematica");
        Professor professor2 = new Professor("Agud", "Portugues");

        cienciasExatas.professores.add(professor);
        cienciasHumanas.professores.add(professor2);

        System.out.println(uniTeste);
    }
}
