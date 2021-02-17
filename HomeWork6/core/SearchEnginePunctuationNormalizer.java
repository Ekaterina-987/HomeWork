package home_work_6.core;

import home_work_6.core.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = text.replaceAll("[,.!?0123456789()\"\"--\"]", "");

        String t = text.toLowerCase();
        String w = word.toLowerCase();
        int i = t.indexOf(w);
        long count = 0;
        while (i >= 0){
        count++;
        i = t.indexOf(w, i + 1);
        }

        return count;
    }
}
