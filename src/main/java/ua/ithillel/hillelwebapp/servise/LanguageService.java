package ua.ithillel.hillelwebapp.servise;

import ua.ithillel.hillelwebapp.model.Language;

import java.util.ArrayList;
import java.util.List;

public class LanguageService {

    public List<String> getLanguageFeatures(Language language) {
        List<String> features = new ArrayList<>();

        switch (language) {
            case PYTHON -> {
                features.add("OPP");
                features.add("Readable");
            }
            case JAVA -> {
                features.add("OPP");
                features.add("Platform independent");
            }
            case RUBY -> {
                features.add("OPP");
                features.add("Open Source");
                features.add("Server side scripting");
            }
            case TYPE_SCRIPT -> {
                features.add("Portable");
                features.add("Supports JavaScripts");
            }
            default -> features.add("No features");
        }
        return features;
    }
}