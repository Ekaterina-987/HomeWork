package home_work_1;

public class Number7 {
    public static String toBinaryString(byte number){
        String numberBinary;
        if(number >= 0){
            numberBinary = String.format("%8s", Integer.toBinaryString(number)).replace(" ", "0");
        }else {
            numberBinary = Integer.toBinaryString(number).substring(24);
        }
        return numberBinary;
    }

    public static void main(String[] args) {
        byte number1 = 15;
        byte number2 = -15;
        byte number3 = 42;
        byte number4 = -42;
        System.out.println("Двоичное представление числа " + number1 + ": " + toBinaryString(number1));
        System.out.println("Двоичное представление числа " + number2 + ": " + toBinaryString(number2));
        System.out.println("Двоичное представление числа " + number3 + ": " + toBinaryString(number3));
        System.out.println("Двоичное представление числа " + number4 + ": " + toBinaryString(number4));

    }
}
