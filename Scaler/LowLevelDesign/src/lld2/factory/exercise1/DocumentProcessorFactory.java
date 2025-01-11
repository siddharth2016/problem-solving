
public class DocumentProcessorFactory {

    public static DocumentProcessor createProcessor(DocumentType type, String name) {
        switch(type) {
            case TEXT: return new TextDocumentProcessor(name);
            case PRESENTATION: return new PresentationDocumentProcessor(name);
            case SPREAD_SHEET: return new SpreadsheetDocumentProcessor(name);
            default: return null;
        }
    }
}