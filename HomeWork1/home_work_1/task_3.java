package home_work_1;

import java.util.Scanner;

// Вводятся два целых числа. Проверить делится ли первое на второе. Вывести на экран сообщение об этом,
// а также остаток (если он есть) и частное (в любом случае).
public class task_3 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа.");
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a%b == 0){
            System.out.println("Первое число делится на второе без остатка.\nЧастное от деления " + a/b + ".");
        } else {
            System.out.println("Остаток от деления первого числа на второе " + a%b + ".");
            System.out.print("Частное от деления " + a/b + ".");
        }
    }
}
