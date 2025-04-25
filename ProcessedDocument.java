public class ProcessedDocument {

    public static void main(String[] args) {

        DocumentRegistry registry = new DocumentRegistry();
        System.out.println("");
        
        PdfDocument pdf1 = registry.createPdfDocument();
        pdf1.setFileName("annual_report_2024.pdf");
        pdf1.setAuthor("Acme Corp");
        pdf1.setPageCount(150);
        pdf1.setName("Annual Report");
        
        TextDocument text = registry.createTextDocument();
        text.setFilePath("meeting_notes.txt");
        text.setEncoding("UTF-8");
        text.setWordCount(250);
        
        SpreadsheetDocument spreadsheet = registry.createSpreadsheetDocument();
        spreadsheet.setSpreadsheetName("sales_data_q1.xlsx");
        spreadsheet.setRowCount(1000);
        spreadsheet.setColumnCount(20);
        
        PdfDocument pdf2 = (PdfDocument) pdf1.clone();
        pdf2.setFileName("summary_report.pdf");
        pdf2.setPageCount(30);
        
        pdf1.open();
        text.open();
        spreadsheet.open();
        
        System.out.println("Opening PDF Document: " + pdf2.getFileName() + " by " + pdf2.getAuthor() + " (" + pdf2.getPageCount() + " pages)");
    }
}