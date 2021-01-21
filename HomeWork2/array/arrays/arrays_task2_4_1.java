package arrays;

// Сумма четных положительных элементов массива

import java.util.Scanner;

public class arrays_task2_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int a = scanner.nextInt();
        int[] array = new int[a];
        int i;
        int sum = 0;

        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 - 5);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        for (i = 0; i < array.length; i++) {
            if (array[i]%2==0 && array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма положительных четных чисел равна " + sum);
    }

}
