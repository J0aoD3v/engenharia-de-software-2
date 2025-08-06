package eng2.solid.ex03;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Cálculo de Áreas (LSP) ---");

        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(5);
        retangulo.setAltura(10);
        System.out.println("Área do retângulo: " + retangulo.calcularArea()); // 50

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(5);
        System.out.println("Área do quadrado: " + quadrado.calcularArea()); // 25
    }
}
