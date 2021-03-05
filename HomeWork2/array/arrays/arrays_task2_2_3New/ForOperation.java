package arrays.arrays_task2_2_3New;

import arrays.arrays_task2_2_3New.api.IArraysOperation;

import java.util.Arrays;
import java.util.Scanner;

public class ForOperation implements IArraysOperation {

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
        for (int j = 0; j < container.length; j++){
            System.out.print(container[j] + " ");
        }
        return container;
    }

    @Override
    public int[] everySecondElements(int[] container) {
        System.out.println(" ");
        for (int j = 1; j < container.length; j++){
            System.out.print(container[j] + " ");
            j = j + 1;
        }
        return container;
    }

    @Override
    public int[] reverseOrderElements(int[] container) {
        System.out.println(" ");
        for (int j = container.length - 1; j >= 0; j--){
            System.out.print(container[j] + " ");
        }
        return container;
    }
}
