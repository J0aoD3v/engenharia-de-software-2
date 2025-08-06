package eng2.solid.ex02;

public class CalculadoraImpostos {
    public double calcular(double valor, CalculoImposto estrategiaDeCalculo) {
        if (estrategiaDeCalculo == null) {
            throw new IllegalArgumentException("Estratégia de cálculo não pode ser nula.");
        }
        return estrategiaDeCalculo.calcular(valor);
    }
}
