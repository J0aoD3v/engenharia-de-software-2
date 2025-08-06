package eng2.solid.ex05;

public class ItemEmprestimo {
    private Livro livro;
    private Titulo titulo;

    public ItemEmprestimo(Livro livro, Titulo titulo) {
        this.livro = livro;
        this.titulo = titulo;
    }

    public Livro getLivro() {
        return livro;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    // ItemEmprestimo conhece seu título para fornecer prazo
    public int getPrazoEmprestimo() {
        return titulo.getPrazoEmprestimoDias();
    }
}
