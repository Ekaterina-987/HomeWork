package home_work_6;

import home_work_6.core.RegExSearch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FilesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес папки, из которой будут считываться текстовые файлы.");
        String books = scanner.nextLine();

        File file = new File(books);
        File[] files = file.listFiles();
        if(file.isDirectory()){
            for(File file1 : files){
                System.out.println(file1.getName());
            }
        }
        System.out.println(" ");
        System.out.println("Введите название книги, с которой будете работать.");
        String nameBook = scanner.nextLine();
        String text = null;

        try {
            text = Files.readString(Path.of(books, nameBook));
        }catch (IOException e){
            System.out.println("Такой книги нет в списке.");
        }

        System.out.println(" ");
        System.out.println("Введите слово, которое необходимо найти в книге.");
        String word;

        RegExSearch regSearch = new RegExSearch();
        File fileNew = new File("result.txt");
        FileWriter countWord = null;

        try {
            countWord = new FileWriter(fileNew, fileNew.exists());
            do{
                word = scanner.nextLine();
                long result = regSearch.search(text, word);
                countWord.write("Слово \'" + word + "\' встречается в тексте " + result + " раз.");
                System.out.println("Введите следующее слово или 'завершить', чтобы закончить поиск слов.");
            }while (!word.equals("завершить"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Поиск слов закончен.");
    }
}
