package eng2.solid.ex02;

public class Main {
    public static void main(String[] args) {
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        double valorBase = 1000.0;

        System.out.println("--- Cálculos de Impostos (OCP) ---");

        // Calcula o ICMS
        double icms = calculadora.calcular(valorBase, new CalculoICMS());
        System.out.println("Valor do ICMS a ser pago: " + icms); // 180.0

        // Calcula o ISS
        double iss = calculadora.calcular(valorBase, new CalculoISS());
        System.out.println("Valor do ISS a ser pago: " + iss); // 50.0

        // Calcula o IPI
        double ipi = calculadora.calcular(valorBase, new CalculoIPI());
        System.out.println("Valor do IPI a ser pago: " + ipi); // 100.0
    }
}
