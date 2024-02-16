package Aula1602;

import Aula1602.NewPackage.NewImport;
//import src.ContaBancaria;
import java.util.Random;
import static java.lang.System.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        long l = currentTimeMillis();
        Random r = new Random();
        out.println(r.nextInt(11));
        ImportTest teste = new ImportTest();
        NewImport newImport = new NewImport("Teste");
        newImport.newMensagem = "Hello World";
        String text = newImport.getText();
        newImport.imprimirMensagem(newImport.newMensagem);
        java.util.ArrayList<String> strings = new java.util.ArrayList<>();
        double pi = Math.PI;
        long t = currentTimeMillis();
        out.println((t-l)/1000);
    }
}
