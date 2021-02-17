package home_work_6.core;

import home_work_6.core.api.ITextSpliterator;

public class DefaultTextSpliterator implements ITextSpliterator {
    @Override
    public String[] split(String text) {
        return text.split(" ");
    }
}
