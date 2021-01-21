package home_work_1;

//Перевести число, введенное пользователем, в байты или килобайты в зависимости от его выбора.

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        int a;
        String x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число.");
        a = scanner.nextInt();
        Scanner in = new Scanner(System.in);
        System.out.println("Если хотите перевести число в байты, введите - b, если в килобайты - k.");
        x = in.nextLine();

        switch (x){
            case("b"):
                System.out.println("Ответ: " + a * 1024 + "байт.");
                break;
            case("k"):
                System.out.println("Ответ: " + a / 1024.0 + "кб.");
                break;
            default:
                System.out.println("Вы ввели неверный символ.");

        }
    }
}
