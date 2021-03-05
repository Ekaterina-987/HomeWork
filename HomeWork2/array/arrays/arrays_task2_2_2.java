package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_task2_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] container = arrayFromConsole(scanner);
        System.out.println("----------------");
        System.out.println("Задача 2.2.1. Вывести все элементы в консоль.");
        System.out.println("- при помощи метода do...while:");
        doWhileMethod(container);
        System.out.println("\n- при помощи метода while:");
        whileMethod(container);
        System.out.println("\n- при помощи метода for:");
        forMethod(container);
        System.out.println("\n- при помощи метода foreach:");
        foreachMethod(container);
        System.out.println("\n-----------------");
        System.out.println("Задача 2.2.2. Вывести каждый второй элемент массива в консоль.");
        System.out.println("- при помощи метода do...while:");
        doWhileMethod2(container);
        System.out.println("\n- при помощи метода while:");
        whileMethod2(container);
        System.out.println("\n- при помощи метода for:");
        forMethod2(container);
        System.out.println("\n- при помощи метода foreach:");
        foreachMethod2(container);
        System.out.println("\n------------------");
        System.out.println("Задача 2.2.3. Вывести все элементы массива в консоль в обратном порядке.");
        System.out.println("- при помощи метода do...while:");
        doWhileMethod3(container);
        System.out.println("\n- при помощи метода while:");
        whileMethod3(container);
        System.out.println("\n- при помощи метода for:");
        forMethod3(container);
        System.out.println("\n- при помощи метода foreach:");
        foreachMethod3(container);
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

    public static void doWhileMethod (int[] container){
        int j = 0;
        do{
            System.out.print(container[j++] + " ");
        }while (j < container.length);
    }

    public static void whileMethod (int[] container){
        int j = 0;
        while (j < container.length){
            System.out.print(container[j] + " ");
            j++;
        }
    }

    public static void forMethod (int[] container){
        for (int j = 0; j < container.length; j++){
            System.out.print(container[j] + " ");
        }
    }

    public static void foreachMethod (int[] container){
        for (int j : container) {
            System.out.print(j + " ");
        }
    }

    public static void doWhileMethod2 (int[] container){
        int j = 1;
        do{
            System.out.print(container[j] + " ");
            j = j + 2;
        }while (j < container.length);
    }

    public static void whileMethod2 (int[] container){
        int j = 1;
        while (j < container.length){
            System.out.print(container[j] + " ");
            j = j + 1;
            j++;
        }
    }

    public static void forMethod2 (int[] container){
        for (int j = 1; j < container.length; j++){
            System.out.print(container[j] + " ");
            j = j + 1;
        }
    }

    public static void foreachMethod2 (int[] container){
        int numb = 0;
        for (int j : container) {
            if(!(numb % 2 == 0)){
                System.out.print(j + " ");
            }
            numb++;
        }
    }

    public static void doWhileMethod3 (int[] container){
        int j = container.length;
        do{
            System.out.print(container[--j] + " ");
        }while (j > 0);
    }

    public static void whileMethod3 (int[] container){
        int j = container.length - 1;
        while (j >= 0){
            System.out.print(container[j] + " ");
            j--;
        }
    }

    public static void forMethod3 (int[] container){
        for (int j = container.length - 1; j >= 0; j--){
            System.out.print(container[j] + " ");
        }
    }

    public static void foreachMethod3 (int[] container){
        int length = 0;
        for (int j : container) {
            length++;
            }
        for(int j = length - 1; j >= 0; j--){
            System.out.print(container[j] + " ");
        }
    }
}
