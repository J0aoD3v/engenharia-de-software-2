package eng2.solid.ex03;

public class Quadrado implements FormaGeometrica {
    private int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularArea() {
        return lado * lado;
    }
}
