package loops_home;

import java.util.Scanner;

// Все цифры из числа премножить между собой и вывести ход вычислений в консоль.

public class loops_task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число.");
        String str = scanner.nextLine();
        if (str.contains(".")){
            System.out.println("Вы ввели не целое число.");
        }else {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (!Character.isDigit(chars[1])) {
                    System.out.println("Введено не число.");
                    break;
                } else {
                    int a = Integer.parseInt(str);
                    int mult = 1;

                    while (a != 0) {
                        mult *= a % 10;
                        a /= 10;
                        System.out.print(a % 10 + " * ");
                    }
                    System.out.println("= " + mult);
                    break;
                }
            }
        }
    }
}
