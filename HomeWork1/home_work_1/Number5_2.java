package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Scanner;

public class Number5_2 implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {
        if (name.equals("Вася")){
            return "Привет!\nЯ тебя так долго ждал.";
        } else if (name.equals("Анастасия")){
            return "Я тебя так долго ждал.";
        } else {
            return "Добрый день. А вы кто?";
        }
    }
}

