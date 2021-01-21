package arrays;

import java.util.Scanner;

// Сжать массив, удалив элементы принадлежащие интервалу.
public class arrays_task2_4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int x = scanner.nextInt();
        int[] array = new int[x];
        int i;
        int a = 20;
        int b = 60;
        int j;
        int m;

        System.out.println("Первоначальный массив:");
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Интервал, в котором необходимо удалить элементы от "
                + a + " до " + b);
        m = x;
        i = 0;
        while (i < m){
            if(array[i] <= b && array[i] >= a){
                m -= 1;
                for(j = i; j < m; j++){
                    array[j] = array[j + 1];
                }
            }else{
                i += 1;
            }
        }
        for(i = m; i < array.length; i++){
            array[i] = 0;
        }
        System.out.println("Новый массив:");
        for(i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
