package home_work_1;

public class number1_2 {
    public static void main(String[] args) {
        int a = -42;  //11010110
        int b = -15;  //11110001

        int c = a & b;  //11010110 & 11110001
        System.out.println("переменная с = " + c); // результат: 11010000

        int d = a | b; //11010110 | 11110001
        System.out.println("переменная d = " + d); // результат: 11110111

        int e = a ^ b;  //11010110 ^ 11110001
        System.out.println("переменная e = " + e); // результат: 00100111

        int f = ~a;  //~11010110
        System.out.println("переменная f = " + f); // результат: 00101001

        int g = ~b; //~11110001
        System.out.println("переменная g = " + g); // результат: 00001110

        int h = a << 2; //11010110 << 2
        System.out.println("переменная h = " + h); // результат: 01011000

        int i = a >> 2;  //11010110 >> 2
        System.out.println("переменная i = " + i); // результат: 11110101

        int k = b << 2;  //11110001 << 2
        System.out.println("переменная k = " + k); // результат: 11000100

        int l = b >> 2;  //11110001 << 2
        System.out.println("переменная l = " + l); // результат: 11111100

    }
}
