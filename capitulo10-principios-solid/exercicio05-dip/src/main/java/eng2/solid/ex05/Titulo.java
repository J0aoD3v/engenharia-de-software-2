package eng2.solid.ex05;

public class Titulo {
    private String nome;
    private String autor;
    private int prazoEmprestimoDias;

    public Titulo(String nome, String autor, int prazoEmprestimoDias) {
        this.nome = nome;
        this.autor = autor;
        this.prazoEmprestimoDias = prazoEmprestimoDias;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    // Titulo é o Expert sobre seu próprio prazo (GRASP Expert)
    public int getPrazoEmprestimoDias() {
        return prazoEmprestimoDias;
    }
}
