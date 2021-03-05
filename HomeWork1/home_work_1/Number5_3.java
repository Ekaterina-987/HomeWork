package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Scanner;

public class Number5_3 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        switch (name){
            case "Вася":
                return "Привет!\nЯ тебя так долго ждал.";
            case "Анастасия":
                return "Я тебя так долго ждал.";
            default:
                return "Добрый день. А вы кто?";
        }
    }
}
