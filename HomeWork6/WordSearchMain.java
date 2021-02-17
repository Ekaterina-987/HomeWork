package home_work_6;

import home_work_6.core.DefaultTextSpliterator;
import home_work_6.core.EasySearch;
import home_work_6.core.RegExSearch;
import home_work_6.core.SearchEnginePunctuationNormalizer;
import home_work_6.core.api.ISearchEngine;
import home_work_6.core.api.ITextSpliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class WordSearchMain {

    public static void main(String[] args) throws IOException{
        String text = Files.readString(Path.of("C:\\Users\\User\\IdeaProjects\\JD1\\Война и мир_книга.txt"));

        text = text.replaceAll("[,.!?0123456789()\"\"--\"]", "");

        ITextSpliterator spliterator = new DefaultTextSpliterator();
        String[] strings = spliterator.split(text);

        Set<String> uniqueString = new HashSet<>();
        for (String string : strings){
            uniqueString.add(string);
        }

        System.out.println("Задание 2.1.");
        System.out.println("Количество использованных слов: " + uniqueString.size());
        System.out.println(" ");

        Map<String, Integer> frequency = new HashMap<>();

        for (String s : strings){
            if (!frequency.containsKey(s)){
                    frequency.put(s, 0);
                }
                frequency.put(s, frequency.get(s) + 1);
            }
        for (String s : frequency.keySet()){
            //System.out.println("Слово \"" + s + "\" в тексте используется " + frequency.get(s) + " раз.");
        }

        System.out.println("Задание 2.2.");

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequency.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println("Ввведите количество слов, из которых хотите составить top N.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Список top " + a + " слов.");
        for( int i = 1; i <= a; i++){
            System.out.print(i + ". ");
            System.out.println(entryList.get(i));
        }
        //Пример:
        //При N=5. Топ-5 слов:
        // 1. и=13871
        // 2. в=6482
        // 3. не=5705
        // 4. что=4728
        // 5. он=3997

        System.out.println(" ");

        System.out.println("Задание 4.1.");
        ISearchEngine searchEngine = new EasySearch();

        System.out.println("Слово \"война\" встречается в тексте " + searchEngine.search(text, "война") + " раз.");
        System.out.println("Слово \"и\" встречается в тексте " + searchEngine.search(text, "и") + " раз.");
        System.out.println("Слово \"мир\" встречается в тексте " + searchEngine.search(text, "мир") + " раз.");

        System.out.println(" ");

        System.out.println("Задание 4.2.");
        ISearchEngine searchEngine1 = new RegExSearch();

        System.out.println("Слово \"война\" встречается в тексте " + searchEngine1.search(text, "война") + " раз.");
        System.out.println("Слово \"и\" встречается в тексте " + searchEngine1.search(text, "и") + " раз.");
        System.out.println("Слово \"мир\" встречается в тексте " + searchEngine1.search(text, "мир") + " раз.");

        System.out.println(" ");

        System.out.println("Задание 4.3, 4.4.");
        ISearchEngine searchEngine2 = new SearchEnginePunctuationNormalizer(new EasySearch());

        System.out.println("Слово \"война\" встречается в тексте " + searchEngine2.search(text, "война") + " раз.");
        System.out.println("Слово \"и\" встречается в тексте " + searchEngine2.search(text, "и") + " раз.");
        System.out.println("Слово \"мир\" встречается в тексте " + searchEngine2.search(text, "мир") + " раз.");

        System.out.println(" ");

    }
}
