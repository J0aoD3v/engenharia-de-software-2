package eng2.solid.ex04;

public class DocumentoTexto implements Documento, Editavel, Imprimivel {
    @Override
    public void criar() {
        System.out.println("Documento de texto criado.");
    }

    @Override
    public void visualizar() {
        System.out.println("Documento de texto visualizado.");
    }

    @Override
    public void editar() {
        System.out.println("Documento de texto editado.");
    }

    @Override
    public void imprimir() {
        System.out.println("Documento de texto impresso.");
    }
}
