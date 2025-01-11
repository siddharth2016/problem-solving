
public class TranslationProviderFactory {
    public static TranslationProviderAdapter createProvider(String provider) {
        if(provider.equals("google")) return new GoogleProviderAdapter();
        else if(provider.equals("microsoft")) return new MicrosoftProviderAdapter();
        else throw new RuntimeException("Invalid provider");
    }
}
