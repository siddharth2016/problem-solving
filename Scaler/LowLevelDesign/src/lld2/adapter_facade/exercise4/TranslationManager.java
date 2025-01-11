import com.assignment.question.TranslationProviderFactory;
import com.assignment.question.TranslationRequest;

public class TranslationManager {

    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {
        return TranslationProviderFactory.createProvider(provider).translate(new TranslationRequest(text, sourceLanguage, targetLanguage, 0.8));
    }

}