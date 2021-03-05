package arrays.arrays_task2_2_3New;

import arrays.arrays_task2_2_3New.api.IArraysOperation;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachOperation implements IArraysOperation {

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
        for (int j : container) {
            System.out.print(j + " ");
        }
        return container;
    }

    @Override
    public int[] everySecondElements(int[] container) {
        System.out.println(" ");
        int numb = 0;
        for (int j : container) {
            if(!(numb % 2 == 0)){
                System.out.print(j + " ");
            }
            numb++;
        }
        return container;
    }

    @Override
    public int[] reverseOrderElements(int[] container) {
        System.out.println(" ");
        int length = 0;
        for (int j : container) {
            length++;
        }
        for(int j = length - 1; j >= 0; j--){
            System.out.print(container[j] + " ");
        }
        return container;
    }
}
