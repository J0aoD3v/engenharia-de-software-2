package eng2.solid.ex05;

import java.util.List;

// Controlador focado apenas no caso de uso de empréstimo
public class EmprestarLivroController implements IEmprestarLivro {
    @Override
    public void executar(Aluno aluno, List<Livro> livros) {
        System.out.println("\n--- INICIANDO CASO DE USO: EMPRESTAR LIVRO ---");
        // O controlador apenas coordena as ações, delegando para os especialistas
        Emprestimo emprestimo = aluno.realizarEmprestimo(livros);
        emprestimo.calcularDataDevolucao();
        // Aqui poderia ter a persistência, etc.
        System.out.println("--- FIM DO CASO DE USO ---");
    }
}
