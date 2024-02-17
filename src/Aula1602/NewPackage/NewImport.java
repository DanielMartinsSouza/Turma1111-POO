package Aula1602.NewPackage;

public class NewImport {
    public String newMensagem;
    private String text;
    protected int numero;

    int teste;

    public NewImport(){
        System.out.println("Construtor privado");
    }

    public NewImport(String newMensagem){
        this();
        this.newMensagem = newMensagem;
    }

    public String getText(){
        return this.text;
    }

    public void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }
    private void novoImprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }
    protected void novoImprimirMensagem2(String mensagem){
        System.out.println(mensagem);
    }
}

class NewImport2 extends NewImport{
    public static void main(String[] args) {
        NewImport newImport = new NewImport("Teste");
        newImport.numero = 4;
    }
    public String newMensagem;
    public void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }
}

