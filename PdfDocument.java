public class PdfDocument implements Document {

    private String fileName;
    private String author;
    private int pageCount;
    private String name;
    
    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }
    
    public PdfDocument(String fileName, String author, int pageCount, String name) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
        this.name = name;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String getFileName() {
        return fileName;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    public int getPageCount() {
        return pageCount;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public Document clone() {
        return new PdfDocument(fileName, author, pageCount, name);
    }
    
    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
        System.out.println(""); 
    }
    
    @Override
    public String getType() {
        return "PDF";
    }
}
