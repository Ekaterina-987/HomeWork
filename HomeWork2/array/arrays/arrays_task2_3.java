package arrays;

import java.util.Random;
import java.util.Scanner;

public class arrays_task2_3 {
    //int[] container;
    public static void main(String[] args) {

        System.out.println("Введите размер массива.");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] container = new int[size];
        int maxValueExclusion = 100;
        Random rand = new Random();
        int i;

        for (i = 0; i < container.length; i++) {
            container[i] = rand.nextInt(maxValueExclusion);
            //System.out.print(container[i] + " ");
        }

        arrayRandom(size, maxValueExclusion);
    }
    public static int[] arrayRandom(int size, int maxValueExclusion){

        int[] container = arrayRandom(size, maxValueExclusion);
        System.out.println(" ");
        return container;
    }
}
