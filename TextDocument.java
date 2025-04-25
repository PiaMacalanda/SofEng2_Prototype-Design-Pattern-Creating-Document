public class TextDocument implements Document {
    private Integer filePath; // Using Integer as per UML
    private String encoding;
    private int wordCount;
    
    public TextDocument() {
        System.out.println("Creating a Text Document prototype.");
    }
    
    public TextDocument(Integer filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
    }
    
    public void setFilePath(String path) {
        this.filePath = path.hashCode();
    }
    
    public void setFilePath(Integer filePath) {
        this.filePath = filePath;
    }
    
    public Integer getFilePath() {
        return filePath;
    }
    
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
    
    public String getEncoding() {
        return encoding;
    }
    
    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
    
    public int getWordCount() {
        return wordCount;
    }
    
    @Override
    public Document clone() {
        return new TextDocument(filePath, encoding, wordCount);
    }
    
    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: " + getType() + ", Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount);
        System.out.println("");
    }
    
    @Override
    public String getType() {
        return "Text";
    }
}