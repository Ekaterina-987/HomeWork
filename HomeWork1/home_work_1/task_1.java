package home_work_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: четное и нечетное");
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a%2==0 && b%2!=0){
            System.out.println("Четное число " + a);
        } else if (b%2==0 && a%2!=0){
            System.out.println("Четное число " + b);
        } else {
            System.out.println("Ошибка. Невыполнено условие.");
        }
    }
}
