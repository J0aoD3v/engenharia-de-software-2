
package eng2.solid.ex02;

public class CalculoISS implements CalculoImposto {
    @Override
    public double calcular(double valor) {
        return valor * 0.05; // Taxa de ISS
    }
}