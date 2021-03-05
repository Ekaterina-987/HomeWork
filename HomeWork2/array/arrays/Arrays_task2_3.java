package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays_task2_3 {
    public static void main(String[] args) {

        System.out.println("Введите размер массива.");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Ввведите до какого числа генерировать рандомные числа.");
        int maxValueExclusion = scanner.nextInt();
        int[] container = arrayRandom(size, maxValueExclusion);
        System.out.println(Arrays.toString(container));
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){

        int[] container = new int[size];
        Random rand = new Random();
        int i;
        for (i = 0; i < size; i++) {
            container[i] = rand.nextInt(maxValueExclusion);
        }
        return container;
    }
}
