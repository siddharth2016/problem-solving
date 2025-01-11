
public class TextDocumentProcessor extends DocumentProcessor {
    private String documentName;

    public TextDocumentProcessor(String documentName) {
        super(documentName);
    }

    public String getDocumentName() {
        return documentName;
    }

    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    public void processDocument() {
        // Implement text document processing logic
        System.out.println("Processing a text document: " + getDocumentName());
        // Additional logic for text document processing
    }
}