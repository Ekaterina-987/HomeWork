package loops_home;

import java.util.Scanner;

// Через консоль пользователь вводит два числа. Первое число - это число, которое мы будем возводить.
// Второе число - это степень, в которую возводят первое число. Степень только положительная и целая.
// Возводимое число - может быть отрицательным и оно будет дробным.
public class Task1_3New {
    public static double exponentNumber (double a, int b){
        double result = 1;
        for (int i = 1; i <= b; i++){
            result = result * a;
        }
        return result;
    }
    //public static void main(String[] args) {
        //double a;
        //int b;
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите два числа.");
        //a = scanner.nextDouble();
        //b = scanner.nextInt();

        //double result = 1;
        //for (int i = 1; i <= b; i++){
        //    result = result * a;
        //}
        //System.out.print(a + " ^ " + b + " = " + result);
    //}
}
