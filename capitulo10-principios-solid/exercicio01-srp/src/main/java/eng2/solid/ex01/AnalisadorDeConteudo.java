package eng2.solid.ex01;

import java.util.List;

// Responsabilidade 2: Analisar o conteúdo
public class AnalisadorDeConteudo {
    public ResultadoAnalise analisar(List<String> linhas) {
        int totalLinhas = linhas.size();
        int totalPalavras = 0;
        int totalCaracteres = 0;

        for (String linha : linhas) {
            // Usa regex \\s+ para contar palavras separadas por um ou mais espaços
            if (!linha.trim().isEmpty()) {
                totalPalavras += linha.trim().split("\\s+").length;
            }
            totalCaracteres += linha.length();
        }
        return new ResultadoAnalise(totalLinhas, totalPalavras, totalCaracteres);
    }
}