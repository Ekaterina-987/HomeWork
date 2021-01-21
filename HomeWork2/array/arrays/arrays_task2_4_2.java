package arrays;

import java.util.Scanner;

// Максимальный из элементов массива с четными индексами
public class arrays_task2_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int a = scanner.nextInt();
        int[] array = new int[a];
        int i;
        int max;
        int index = -1;

        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        max = 0;
        for (i = 0; i < array.length; i++) {
            if(array[i] > max && array[i] % 2 == 0){
                max = array[i];
                index = i;
            }
        }
        System.out.println("Максимальный из элементов массива элемент №" + index + " - " + max);
    }
}
