package eng2.solid.ex05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private Aluno aluno;
    private List<ItemEmprestimo> itensEmprestimo;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Aluno aluno, List<Livro> livros) {
        this.aluno = aluno;
        this.dataEmprestimo = LocalDate.now();
        this.itensEmprestimo = new ArrayList<>();
        
        // Emprestimo cria seus ItemEmprestimo (GRASP Creator)
        for (Livro livro : livros) {
            ItemEmprestimo item = new ItemEmprestimo(livro, livro.getTitulo());
            this.itensEmprestimo.add(item);
        }
    }

    // Emprestimo é o Expert para calcular a devolução (GRASP Expert)
    // Ele percorre seus itens e usa o prazo do Titulo de cada um
    public void calcularDataDevolucao() {
        int maiorPrazo = 0;
        
        // Encontra o maior prazo entre todos os títulos
        for (ItemEmprestimo item : itensEmprestimo) {
            int prazoItem = item.getPrazoEmprestimo();
            if (prazoItem > maiorPrazo) {
                maiorPrazo = prazoItem;
            }
        }
        
        this.dataDevolucao = this.dataEmprestimo.plusDays(maiorPrazo);
        System.out.println("Data de devolução calculada: " + this.dataDevolucao);
    }

    public List<ItemEmprestimo> getItensEmprestimo() {
        return itensEmprestimo;
    }
}
