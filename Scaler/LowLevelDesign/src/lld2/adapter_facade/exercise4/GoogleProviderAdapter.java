import com.assignment.question.external.GoogleTranslateApi;
import com.assignment.question.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleProviderAdapter implements TranslationProviderAdapter {

    private GoogleTranslateApi googleTranslateApi;

    public GoogleProviderAdapter() {
        this.googleTranslateApi = new GoogleTranslateApi();
    }

    @Override
    public String translate(TranslationRequest translationRequest) {
        GoogleTranslationRequest request = new GoogleTranslationRequest(translationRequest.getText(), translationRequest.getSourceLanguage(), translationRequest.getTargetLanguage(), translationRequest.getConfidenceThreshold());
        return googleTranslateApi.convert(request);
    }

    @Override
    public List<String> getLanguages() {
        return googleTranslateApi.getLanguages();
    }

}
