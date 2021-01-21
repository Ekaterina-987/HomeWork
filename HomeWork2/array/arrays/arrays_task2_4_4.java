package arrays;
// Найти два наименьших (минимальных) элемента массива.
import java.util.Scanner;

public class arrays_task2_4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int a = scanner.nextInt();
        int[] array = new int[a];
        int i;
        int min1;
        int min2;

        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        if (array[0] < array[1]) {
            min1 = 0;
            min2 = 1;
        } else {
            min1 = 1;
            min2 = 0;
        }

        for (i = 2; i < array.length; i++){
            if(array[i] < array[min1]){
                min1 = i;
            }else{
                if (array[i] < array[min2]){
                    min2 = i;
                }
            }
        }
        System.out.println("Два минимальных элемента массива: №" + (min1 + 1) + " - "
                + array[min1] + ", №" + (min2 + 1) + " - " + array[min2]);
    }
}