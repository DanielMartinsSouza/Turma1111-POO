package Aula1602;

import Aula1602.NewPackage.NewImport;
import Aula1602.NewPackage.RecordClass;
//import src.ContaBancaria;
import java.util.Random;
import static java.lang.System.*;


public class Main extends NewImport{
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.numero = 5;
        main.novoImprimirMensagem2("Teste Main");
//        main.teste;
        long l = currentTimeMillis();
        Random r = new Random();
        out.println(r.nextInt(11));
        ImportTest teste = new ImportTest();
        NewImport newImport = new NewImport("Teste");
        newImport.newMensagem = "Hello World";
//        newImport.numero = 5;
        String text = newImport.getText();
        newImport.imprimirMensagem(newImport.newMensagem);
        java.util.ArrayList<String> strings = new java.util.ArrayList<>();
        double pi = Math.PI;
        long t = currentTimeMillis();
        out.println((t-l)/1000);

        RecordClass recordClass = new RecordClass("Hello", 10);
        out.println(recordClass.mensagem());
        out.println(recordClass.numero());
    }
}
