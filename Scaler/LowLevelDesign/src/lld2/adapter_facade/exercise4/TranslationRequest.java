

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;

// DO NOT REMOVE THE NO-ARG CONSTRUCTOR ANNOTATION
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TranslationRequest {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;
}