package home_work_1;

public class number1_1 {
    public static void main(String[] args) {
        int a = 42;  //00101010
        int b = 15;  //00001111

        int c = a & b;  // 00101010 & 00001111
        System.out.println("переменная c = " + c);  // результат: 00001010

        int d = a | b;  //00101010 | 00001111
        System.out.println("переменная d = " + d);  // результат: 00101111

        int e = a ^ b; //00101010 ^ 00001111
        System.out.println("переменная e = " + e);  //результат: 00100101

        int f = ~a; //~00101010
        System.out.println("переменная f = " + f);  //результат: 11010101

        int g = ~b; //~00001111
        System.out.println("переменная g = " + g);  //результат: 11110000

        int h = a << 2;  //00101010 << 2
        System.out.println("переменная h = " + h);  //результат: 10101000

        int i = a >> 2;  //00101010 >> 2
        System.out.println("переменная i = " + i);  //результат: 00001010

        int k = b << 2;  //00001111 << 2
        System.out.println("переменная k = " + k);  //результат: 00111100

        int l = b >> 2;  //00001111 >> 2
        System.out.println("переменная l = " + l);  //результат: 00000011

    }

}
