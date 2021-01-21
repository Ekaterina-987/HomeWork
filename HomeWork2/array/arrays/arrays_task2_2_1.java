package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class arrays_task2_2_1 {
    public static void main(String[] args){
        arrayFromConsole();

    }
    public static int[] arrayFromConsole() {
        System.out.println("Введите размер массива.");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] container = new int[a];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < container.length; i++) {
            container[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(container));
        return container;
    }
}
