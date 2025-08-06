
package eng2.solid.ex01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        String nomeArquivo = "meu_arquivo.txt";

        // Cria um arquivo de teste
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write("Este é um exemplo de arquivo de texto.\n");
            writer.write("Ele tem várias linhas e palavras.\n");
            writer.write("SOLID é muito importante.");
        } catch (IOException e) {
            System.err.println("Erro ao criar arquivo de teste: " + e.getMessage());
            return;
        }

        // Orquestra as operações
        try {
            LeitorDeArquivo leitor = new LeitorDeArquivo(nomeArquivo);
            List<String> conteudo = leitor.lerLinhas();

            AnalisadorDeConteudo analisador = new AnalisadorDeConteudo();
            ResultadoAnalise resultado = analisador.analisar(conteudo);

            ExibidorDeResultados exibidor = new ExibidorDeResultados();
            exibidor.exibir(resultado);

        } catch (IOException e) {
            System.err.println("Erro ao processar o arquivo: " + e.getMessage());
        }
    }
}