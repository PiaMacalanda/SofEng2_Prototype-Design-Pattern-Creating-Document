public class DocumentRegistry {

    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;
    
    public DocumentRegistry() {
        pdfPrototype = new PdfDocument();
        textDocumentPrototype = new TextDocument();
        spreadsheetPrototype = new SpreadsheetDocument();
    }
    
    public PdfDocument createPdfDocument() {
        return (PdfDocument) pdfPrototype.clone();
    }
    
    public TextDocument createTextDocument() {
        return (TextDocument) textDocumentPrototype.clone();
    }
    
    public SpreadsheetDocument createSpreadsheetDocument() {
        return (SpreadsheetDocument) spreadsheetPrototype.clone();
    }
}