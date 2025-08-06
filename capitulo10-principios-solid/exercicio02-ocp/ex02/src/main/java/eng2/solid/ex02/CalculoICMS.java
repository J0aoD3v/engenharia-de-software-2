
package eng2.solid.ex02;

public class CalculoICMS implements CalculoImposto {
    @Override
    public double calcular(double valor) {
        return valor * 0.18; // Taxa de ICMS
    }
}