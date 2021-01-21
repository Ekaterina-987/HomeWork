package home_work_1;

import java.util.Scanner;

//Вводятся три разных числа. Найти, какое из них является средним (больше одного, но меньше другого).
public class task_2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три разных числа.");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a > b && a < c ){
            System.out.println("Первое набранное число из трех " + a + " является средним.");
        } else if (a > c && a < b){
            System.out.println("Первое набранное число из трех " + a + " является средним.");
        } else if (b > a && b < c){
            System.out.println("Второе набранное число из трех " + b + " является средним.");
        } else if (b > c && b < a){
            System.out.println("Второе набранное число из трех " + b + " является средним.");
        } else if (c > a && c < b){
            System.out.println("Третье набранное число из трех " + c + " является средним.");
        } else if (c > b && c < a){
            System.out.println("Третье набранное число из трех " + c + " является средним.");
        } else {
            System.out.println("Ошибка. Необходимо ввести три разных числа.");
        }

    }
}
