import com.assignment.question.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftProviderAdapter implements TranslationProviderAdapter {

    private MicrosoftTranslateApi microsoftTranslateApi;

    public MicrosoftProviderAdapter() {
        this.microsoftTranslateApi = new MicrosoftTranslateApi();
    }

    @Override
    public String translate(TranslationRequest request) {
        return microsoftTranslateApi.translate(request.getText(), request.getSourceLanguage(), request.getTargetLanguage());
    }

    @Override
    public List<String> getLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }

}
