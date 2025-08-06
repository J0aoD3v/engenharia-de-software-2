
package eng2.solid.ex01;

// Responsabilidade 3: Exibir os resultados
public class ExibidorDeResultados {
    public void exibir(ResultadoAnalise resultado) {
        System.out.println("--- Resultado da Analise (SRP) ---");
        System.out.println("Total de linhas: " + resultado.getTotalLinhas());
        System.out.println("Total de palavras: " + resultado.getTotalPalavras());
        System.out.println("Total de caracteres: " + resultado.getTotalCaracteres());
    }
}