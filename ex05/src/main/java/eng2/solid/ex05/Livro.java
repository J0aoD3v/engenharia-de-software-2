package eng2.solid.ex05;

public class Livro {
    private Titulo titulo;
    private String codigoExemplar;

    public Livro(Titulo titulo, String codigoExemplar) {
        this.titulo = titulo;
        this.codigoExemplar = codigoExemplar;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public String getCodigoExemplar() {
        return codigoExemplar;
    }
}
