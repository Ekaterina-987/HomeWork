package home_work_1;

import java.util.Scanner;

public class number5_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя.");
        String name = in.nextLine();

        if (name.equals("Вася")){
            System.out.println("Привет!\nЯ тебя так долго ждал.");
        } else {
            if (name.equals("Анастасия")){
                System.out.println("Я тебя так долго ждал.");
            } else {
                System.out.println("Добрый день. А вы кто?");
            }
        }
    }
}
