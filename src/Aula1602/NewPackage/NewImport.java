package Aula1602.NewPackage;

public class NewImport {
    public String newMensagem;
    private String text;

    private NewImport(){
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
}

class NewImport2 {
    public String newMensagem;
    public void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }
}

