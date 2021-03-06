package loops_home;

import java.util.Scanner;

// Все цифры из числа премножить между собой и вывести ход вычислений в консоль.

public class Task1_2New {
    public static int multiplayNumbers (int a) {
        int mult = 1;

        while (a != 0) {
            mult *= a % 10;
            a /= 10;
        }
        return mult;
    }
}
