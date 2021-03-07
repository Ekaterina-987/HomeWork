package home_work_3.calcs.simple;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMathCopyTest {
    public final CalculatorWithMathCopy calcCopy = new CalculatorWithMathCopy();

    //4.1 + 15 * 7 + (28 / 5) ^ 2

    @Test
    @DisplayName("Умножение.")
    public void mult(){
        assertEquals(105, calcCopy.mult(15, 7));
    }

    @Test
    @DisplayName("Деление.")
    public void division(){
        assertEquals(5.6, calcCopy.division(28, 5));
    }

    @Test
    @DisplayName("Возведение в степень.")
    public void exponentation(){
        assertEquals(31.359999999999996, calcCopy.exponentiation(5.6, 2));
    }

    @Test
    @DisplayName("Сложение.")
    public void summ(){
        assertEquals(136.359999999999996, calcCopy.summ(105, 31.359999999999996));
        assertEquals(140.45999999999998, calcCopy.summ(4.1, 136.359999999999996));
    }

    @Test
    @DisplayName("Разность.")
    public void diff(){
        assertEquals(74, calcCopy.diff(105, 31));
    }

    @Test
    @DisplayName("Модуль числа.")
    public void modul(){
        assertEquals(85, calcCopy.modul(-85));
        assertEquals(85, calcCopy.modul(85));
    }

    @Test
    @DisplayName("Корень числа.")
    public void rootOfNumber(){
        assertEquals(5, calcCopy.rootOfNumber(25));
    }
}
