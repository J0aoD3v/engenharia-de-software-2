package eng2.solid.ex02;

public class CalculoIPI implements CalculoImposto {
    @Override
    public double calcular(double valor) {
        return valor * 0.10; // Taxa de IPI
    }
}
