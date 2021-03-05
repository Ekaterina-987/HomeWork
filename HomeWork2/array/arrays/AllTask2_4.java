package arrays;
// 2.4.1 Сумма четных положительных элементов массива
// 2.4.2 Максимальный из элементов массива с четными индексами
// 2.4.3 Элементы массива, которые меньше среднего арифметического
// 2.4.4 Найти два наименьших (минимальных) элемента массива.
// 2.4.5 Сжать массив, удалив элементы принадлежащие интервалу.
// 2.4.6 Сумма цифр массива.

public class AllTask2_4 {

    public int summEvenElements (int[] container){
        System.out.println(" ");
        int i;
        int sum = 0;
        for (i = 0; i < container.length; i++) {
            if (container[i] % 2 == 0 && container[i] > 0) {
                sum += container[i];
            }
        }
        System.out.println(sum);
        return sum;
    }

    public int maxEvenElements (int[] container){
        int i;
        int max = 0;

        for (i = 0; i < container.length; i++) {
            if(container[i] > max && container[i] % 2 == 0){
                max = container[i];
            }
        }
        System.out.println(max);
        return max;
    }

    public int[] lessThanArithmeticMean (int[] container) {
        int i, average;
        int sum = 0;

        for (i = 0; i < container.length; i++) {
            sum += container[i];
        }
        average = sum / container.length;

        for (i = 0; i < container.length; i++) {
            if (container[i] < average) {
                System.out.print(container[i] + " ");
            }
        }
        return container;
    }

    public int[] twoSmallElements(int[] container){
        int i, min1, min2;

        if (container[0] < container[1]) {
            min1 = 0;
            min2 = 1;
        } else {
            min1 = 1;
            min2 = 0;
        }

        for (i = 2; i < container.length; i++){
            if(container[i] < container[min1]){
                min1 = i;
            }else{
                if (container[i] < container[min2]){
                    min2 = i;
                }
            }
        }
        System.out.println(container[min1] + " " + container[min2]);
        return container;
    }

    public int[] compressArray(int[] container){
        int i, j;
        int a = 20;
        int b = 60;
        int m = container.length;

        i = 0;
        while (i < m){
            if(container[i] <= b && container[i] >= a){
                m -= 1;
                for(j = i; j < m; j++){
                    container[j] = container[j + 1];
                }
            }else{
                i += 1;
            }
        }
        for(i = m; i < container.length; i++){
            container[i] = 0;
        }
        for(i = 0; i < container.length; i++){
            System.out.print(container[i] + " ");
        }
        return container;
    }

    public int summNumberArray(int[] container){
        System.out.println(" ");
        int i;
        int sumNumber = 0;

        for (i = 0; i < container.length; i++) {
            int x = container[i];
            while (x > 0){
                sumNumber += x % 10;
                x /= 10;
            }
        }
        System.out.print(sumNumber);
        return sumNumber;
    }
}
