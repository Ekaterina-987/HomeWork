package arrays;
// Сумма цифр массива.
import java.util.Scanner;

public class arrays_task2_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int a = scanner.nextInt();
        int[] array = new int[a];
        int i;
        int sum = 0;

        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        for (i = 0; i < array.length; i++) {
            int x = array[i];
            while (x > 0){
                sum += x % 10;
                x /= 10;
            }
        }
        System.out.print("Сумма цифр массива равна " + sum + ".");
    }
}
