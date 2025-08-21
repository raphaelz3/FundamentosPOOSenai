package Biblioteca;

public class Revista extends ItemBiblioteca{
    private String autor;

    public Revista(String autor,String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println(autor);
    }
}
