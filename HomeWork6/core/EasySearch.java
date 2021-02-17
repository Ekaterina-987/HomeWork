package home_work_6.core;

import home_work_6.core.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        int index = text.indexOf(word);
        int count = 0;
        while (index != -1){
            count++;
            text = text.substring(index + 1);
            index = text.indexOf(word);
        }
        return count;
    }
}
