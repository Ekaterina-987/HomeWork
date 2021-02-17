package home_work_6.core;

import home_work_6.core.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {

        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()){
            count++;

        }
        return count;
    }
}
