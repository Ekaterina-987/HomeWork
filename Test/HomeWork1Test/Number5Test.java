package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Number5Test {
    private final Number5_1 numb5_1 = new Number5_1();
    private final Number5_2 numb5_2 = new Number5_2();
    private final Number5_3 numb5_3 = new Number5_3();

    String name1 = "Вася";
    String name2 = "Анастасия";
    String name3 = "Оля";

    String result1 = "Привет!\nЯ тебя так долго ждал.";
    String result2 = "Я тебя так долго ждал.";
    String result3 = "Добрый день. А вы кто?";

    @Test
    @DisplayName("Number 5.1. Operator if.")
    public void ifOperator(){
        assertEquals (numb5_1.welcome(name1), result1);
        assertEquals (numb5_1.welcome(name2), result2);
        assertEquals (numb5_1.welcome(name3), result3);
    }

    @Test
    @DisplayName("Number 5.2. Operator if-else.")
    public void ifElseOperator(){
        assertEquals (numb5_2.welcome(name1), result1);
        assertEquals (numb5_2.welcome(name2), result2);
        assertEquals (numb5_2.welcome(name3), result3);
    }

    @Test
    @DisplayName("Number 5.3. Operator switch.")
    public void switchElseOperator(){
        assertEquals (numb5_3.welcome(name1), result1);
        assertEquals (numb5_3.welcome(name2), result2);
        assertEquals (numb5_3.welcome(name3), result3);
    }
}
