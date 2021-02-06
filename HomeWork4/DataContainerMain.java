package home_work_4;

import home_work_4.core.DataContainer;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, null, 4, 5};
        DataContainer<Integer> container = new DataContainer<>(data);

        System.out.println("Задание 4.");
        container.add(777);
        System.out.println("Добавляем число 777 в первую ячейку после последней заполненной ячейки.");
        System.out.println(container);
        System.out.println("Добавляем число 111 и увеличиваем длину массива.");
        container.add(111);
        System.out.println(container);
        System.out.println(" ");

        System.out.println("Задание 5.");
        System.out.println("Получаем число, которое стоит под вызванным индексом - " + container.get(3));
        System.out.println("При вызове индекса больше, чем длина массива, получаем - " + container.get(10));
        System.out.println(" ");

        System.out.println("Задание 6.");
        Integer[] newData = container.getItems();
        System.out.println(Arrays.toString(newData));
        System.out.println(" ");

        System.out.println("Задание 7.");
        System.out.println("Удаляем из массива число, соответствующее вызываемому индексу.");
        System.out.println("Метод delete возвращает - " + container.delete(1));
        System.out.println("При попытке вызвать индекс, который больше, чем длина массива.");
        System.out.println("Метод delete возвращает - " + container.delete(10));
        System.out.println(" ");

        System.out.println("Задание 8.");
        System.out.println("Удаляем из массива вызванное число.");
        System.out.println("Метод delete возвращает - " + container.delete((Integer)1));
        System.out.println("При попытке вызвать число, которое отсутствует в массиве.");
        System.out.println("Метод delete возвращает - " + container.delete((Integer)5555));
        System.out.println(" ");

        System.out.println("Задание 9.");
        container.sort(Comparator.reverseOrder());
        System.out.println(container.toString());
        System.out.println(" ");

        System.out.println("Задание 10.");
        System.out.println(Arrays.toString(data));
    }
}
