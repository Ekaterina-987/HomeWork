package home_work_1;

public class number2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 8;
        int a = 5 + x / y;  //  Итог: 5. 1) 2/8=0; 2) 5+0=5.
        System.out.println("a = " + a);

        x = 2;
        y = 8;
        int b = (5 + x) / y;  // Итог: 0.  1) 5+2=7; 2) 7/8=0.
        System.out.println("b = " + b);

        x = 2;
        y = 8;
        int c = (5 + x++) / y;  // Итог: 0. 1) 5+2=7 (постунарный оператор увеличивает переменную на 1, но возвращает
        //  исходное значение); 2) 7/7=0.
        System.out.println("c = " + c);

        x = 2;
        y = 8;
        int d = (5 + x++) / --y; // Итог: 1. 1) 5+2=7 (постунарный оператор увеличивает переменную на 1, но возвращает
        // исходное значение); 2) --y=7 (преунарный оператор уменьш. на 1); 3) 7/7=1.
        System.out.println("d = " + d);

        x = 2;
        y = 8;
        int e = (5 * 2 >> x++) / --y; // Итог: 0. 1) 5*2=10; 2) 10 в двоичной системе 00001010; 3) х++ - постунарный
        // оператор, возвращает значение 2; 4) 10 >> 2 - значение правых операндов
        // смещается на 2 - 00000010, в десятичной системе это 2; 5) --у=7 (преунарный
        // оператор уменьш. на 1); 6) 2/7=0.
        System.out.println("e = " + e);

        x = 2;
        y = 8;
        int f = (5 + 7 > 20 ? 68 : 22 * 2 >> x++) / --y;  // 1) 5+7=12; 2) 12>20 - false, выполняется второй операнд;
        // 3) 22*2=44; 4) 44 в двоичной системе 00101100; 5) х++ - постунарный опратор,
        // возвращает значение 2; 6) 44 >> 2 - значение правых операндов смещается на 2 -
        // 00001011, в десятичной системе это 11; 7) --у=7 (преунарный оператор уменьш.
        // на 1); 8) 11/7=1.      Итог: 1.
        System.out.println("f = " + f);

        //int g = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> x++) / --y;  // ошибка, т.к. результат выполнения оператора
        // ">=" является тип boolean
        //System.out.println(g);

        boolean h = (6 - 2 > 3 && 12 * 12 <= 119); //Итог: false. 1) 6-2=4; 2) 4>3 - true; 3) 12*12=144;
        // 4) 144 <= 119 - false
        System.out.println("h = " + h);

        boolean i = true && false; //Итог: false, т.к. один из операндов равен false.
        System.out.println("i = " + i);


    }

}
