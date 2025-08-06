package eng2.solid.ex05;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Emprestimo> emprestimos;

    public Aluno(String nome) {
        this.nome = nome;
        this.emprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    // Aluno é o criador do empréstimo (GRASP Creator / SRP)
    public Emprestimo realizarEmprestimo(List<Livro> livros) {
        Emprestimo novoEmprestimo = new Emprestimo(this, livros);
        this.emprestimos.add(novoEmprestimo);
        System.out.println("Aluno " + nome + " realizou um empréstimo.");
        return novoEmprestimo;
    }
}
