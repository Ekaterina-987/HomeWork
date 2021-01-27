package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculatorWithCounterClassic = new CalculatorWithCounterClassic();

        double x1 = calculatorWithCounterClassic.mult(15,7);
        System.out.println("1.  15 * 7 = " + x1);  // 105
        calculatorWithCounterClassic.incementCountOperation();

        double x2 = calculatorWithCounterClassic.division(28,5);
        System.out.println("2.  28 / 5 = " + x2);  // 5.6
        calculatorWithCounterClassic.incementCountOperation();

        double x3 = calculatorWithCounterClassic.exponentiation(x2, 2);
        System.out.println("3.  (28 / 5) ^ 2 = " + x3);  // 31.359999999999996
        calculatorWithCounterClassic.incementCountOperation();

        double x4 = calculatorWithCounterClassic.summ(x1, x3);
        System.out.println("4.  15 * 7 + (28 / 5) ^ 2 = " + x4);  // 136.35999999999999
        calculatorWithCounterClassic.incementCountOperation();

        double x5 = calculatorWithCounterClassic.summ(4.1, x4);
        System.out.println("5.  4.1 + 15 * 7 + (28 / 5) ^ 2 = " + x5);  // 140.45999999999998
        calculatorWithCounterClassic.incementCountOperation();

        System.out.println(" ");
        System.out.println("Количество математических операций = " + calculatorWithCounterClassic.getCountOperation());

    }
}
