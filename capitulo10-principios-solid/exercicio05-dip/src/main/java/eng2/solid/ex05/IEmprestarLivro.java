package eng2.solid.ex05;

import java.util.List;

// Interface específica para o caso de uso de empréstimo
public interface IEmprestarLivro {
    void executar(Aluno aluno, List<Livro> livros);
}
