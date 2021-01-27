package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();

        double x1 = calculatorWithMathCopy.mult(15,7);
        System.out.println("1.  15 * 7 = " + x1);  // 105
        double x2 = calculatorWithMathCopy.division(28,5);
        System.out.println("2.  28 / 5 = " + x2);  // 5.6
        double x3 = calculatorWithMathCopy.exponentiation(x2, 2);
        System.out.println("3.  (28 / 5) ^ 2 = " + x3);  // 31.359999999999996
        double x4 = calculatorWithMathCopy.summ(x1, x3);
        System.out.println("4.  15 * 7 + (28 / 5) ^ 2 = " + x4);  // 136.35999999999999
        double x5 = calculatorWithMathCopy.summ(4.1, x4);
        System.out.println("5.  4.1 + 15 * 7 + (28 / 5) ^ 2 = " + x5);  // 140.45999999999998


    }
}
