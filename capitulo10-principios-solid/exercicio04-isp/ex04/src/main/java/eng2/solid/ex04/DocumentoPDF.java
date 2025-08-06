package eng2.solid.ex04;

public class DocumentoPDF implements Documento, Imprimivel {
    @Override
    public void criar() {
        System.out.println("PDF criado.");
    }

    @Override
    public void visualizar() {
        System.out.println("PDF visualizado.");
    }

    @Override
    public void imprimir() {
        System.out.println("PDF impresso.");
    }
}
