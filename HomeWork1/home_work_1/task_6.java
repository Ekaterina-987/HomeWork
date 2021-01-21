package home_work_1;

import java.util.Scanner;

// Определить, является ли год, который ввел пользователь, високосным или невисокосным.
public class task_6 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой год.");
        a = scanner.nextInt();

        if (a%4!=0){
            System.out.println("Год, который вы ввели, является невисокосным.");
        }else{
            if (a%100!=0){
                System.out.println("Год, который вы ввели, является високосным.");
            }else if (a%400==0){
                System.out.println("Год, который вы ввели, является високосным.");
            }else{
                System.out.println("Год, который вы ввели, является невисокосным.");
            }
        }
    }
}
