package eng2.solid.ex04;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Manipulando Documentos (ISP) ---");

        System.out.println("\n-- Documento de Texto --");
        DocumentoTexto docTexto = new DocumentoTexto();
        docTexto.criar();
        docTexto.visualizar();
        docTexto.editar();
        docTexto.imprimir();

        System.out.println("\n-- Documento PDF --");
        DocumentoPDF docPDF = new DocumentoPDF();
        docPDF.criar();
        docPDF.visualizar();
        docPDF.imprimir();
        // A chamada docPDF.editar() agora causa um erro de compilação,
        // o que é o comportamento correto e esperado.
    }
}
