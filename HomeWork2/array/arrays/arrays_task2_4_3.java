package arrays;
// Элементы массива, которые меньше среднего арифметического
import java.util.Scanner;

public class arrays_task2_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int a = scanner.nextInt();
        int[] array = new int[a];
        int i;
        int sum = 0;
        int average;

        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        average = sum / a;
        System.out.println(average);

        for (i = 0; i < array.length; i++){
            if(array[i] < average){
                System.out.print(array[i] + " ");
            }
        }

    }

}
