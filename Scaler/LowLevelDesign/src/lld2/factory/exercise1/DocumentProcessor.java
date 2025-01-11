
public abstract class DocumentProcessor {

    private String documentName;
    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }
    public abstract DocumentType supportsType();
    public abstract String getDocumentName();
    public abstract void processDocument();

}