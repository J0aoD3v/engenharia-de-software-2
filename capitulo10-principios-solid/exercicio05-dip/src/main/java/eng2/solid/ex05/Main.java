package eng2.solid.ex05;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Configuração inicial com Titulos e seus prazos específicos
        Titulo tituloCleanCode = new Titulo("Clean Code", "Robert C. Martin", 14);
        Titulo tituloDesignPatterns = new Titulo("Design Patterns", "GoF", 21);

        Aluno joao = new Aluno("João Silva");
        Livro cleanCode = new Livro(tituloCleanCode, "EX001");
        Livro designPatterns = new Livro(tituloDesignPatterns, "EX002");
        List<Livro> livrosParaEmprestar = Arrays.asList(cleanCode, designPatterns);

        // A interface do usuário (simulada aqui pelo Main)
        // depende apenas da interface e do controlador específicos (ISP / DIP)
        IEmprestarLivro controller = new EmprestarLivroController();

        // Executa o caso de uso
        controller.executar(joao, livrosParaEmprestar);

        // Se precisássemos de um caso de uso de devolução, criaríamos um
        // DevolverLivroController e uma interface IDevolverLivro,
        // sem alterar o código existente (OCP).
    }
}
