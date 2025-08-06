
package eng2.solid.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Responsabilidade 1: Ler o arquivo
public class LeitorDeArquivo {
    private final String nomeArquivo;

    public LeitorDeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public List<String> lerLinhas() throws IOException {
        List<String> linhas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        }
        return linhas;
    }
}