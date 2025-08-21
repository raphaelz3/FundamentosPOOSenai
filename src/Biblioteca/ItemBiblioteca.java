package Biblioteca;

public class ItemBiblioteca {
    protected String titulo;
    protected int anoPublicacao;

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInfo(){
        System.out.println(titulo);
        System.out.println(anoPublicacao);
    }
}
