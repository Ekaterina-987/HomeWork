package home_work_1;

import java.util.Scanner;

// Вводится целое число, обозначающее код символа по таблице ASCII.
// Определить это код английской буквы или какой-нибудь иной символ.
public class task_5 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число от 0 до 127.");
        a = scanner.nextInt();
        char ch = (char) a;

        if (ch >= 65 && ch <= 90 | ch >= 97 && ch <= 122){
            System.out.println("Вы ввели код английской буквы - " + ch);
        } else if (ch >= 0 && ch <= 64 | ch >= 91 && ch <= 96 | ch >= 123 && ch <= 127){
            System.out.println("Вы ввели символ - " + ch);
        } else {
            System.out.println("Ошибка. Вы ввели неверное число.");
        }
    }
}
