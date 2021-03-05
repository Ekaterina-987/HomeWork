package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class arrays_task2_2_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] container = arrayFromConsole(scanner);

    }
    public static int[] arrayFromConsole(Scanner scanner) {
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
}
