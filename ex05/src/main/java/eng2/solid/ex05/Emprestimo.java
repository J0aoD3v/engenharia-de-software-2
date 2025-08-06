package eng2.solid.ex05;

import java.time.LocalDate;
import java.util.List;

public class Emprestimo {
    private Aluno aluno;
    private List<Livro> livros;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Aluno aluno, List<Livro> livros) {
        this.aluno = aluno;
        this.livros = livros;
        this.dataEmprestimo = LocalDate.now();
    }

    // Emprestimo é o especialista para calcular a devolução (SRP)
    public void calcularDataDevolucao() {
        // Lógica simples: 14 dias para devolver
        this.dataDevolucao = this.dataEmprestimo.plusDays(14);
        System.out.println("Data de devolução calculada: " + this.dataDevolucao);
    }
}
