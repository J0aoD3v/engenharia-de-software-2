
package eng2.solid.ex01;

// Classe para conter os resultados da análise (Data Transfer Object)
public class ResultadoAnalise {
    private final int totalLinhas;
    private final int totalPalavras;
    private final int totalCaracteres;

    public ResultadoAnalise(int totalLinhas, int totalPalavras, int totalCaracteres) {
        this.totalLinhas = totalLinhas;
        this.totalPalavras = totalPalavras;
        this.totalCaracteres = totalCaracteres;
    }

    public int getTotalLinhas() { return totalLinhas; }
    public int getTotalPalavras() { return totalPalavras; }
    public int getTotalCaracteres() { return totalCaracteres; }
}