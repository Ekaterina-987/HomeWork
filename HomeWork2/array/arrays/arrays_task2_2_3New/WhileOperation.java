package arrays.arrays_task2_2_3New;

import arrays.arrays_task2_2_3New.api.IArraysOperation;

import java.util.Arrays;
import java.util.Scanner;

public class WhileOperation implements IArraysOperation {

    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int a = scanner.nextInt();
        int[] container = new int[a];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < container.length; i++) {
            int b = scanner.nextInt();
            container[i] = b;
        }
        System.out.println(Arrays.toString(container));
        return container;
    }

    @Override
    public int[] allElements(int[] container) {
        int j = 0;
        while (j < container.length){
            System.out.print(container[j] + " ");
            j++;
        }
        return container;
    }

    @Override
    public int[] everySecondElements(int[] container) {
        System.out.println(" ");
        int j = 1;
        while (j < container.length){
            System.out.print(container[j] + " ");
            j = j + 1;
            j++;
        }
        return container;
    }

    @Override
    public int[] reverseOrderElements(int[] container) {
        System.out.println(" ");
        int j = container.length;
        while (j > 0){
            System.out.print(j + " ");
            j--;
        }
        return container;
    }
}
