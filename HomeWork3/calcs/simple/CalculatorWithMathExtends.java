package home_work_3.calcs.simple;

import home_work_3.calcs.additional.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public int modul(int a) {
        modul = Math.abs(a);
        return super.modul(a);
    }

    @Override
    public double exponentiation(double c, int b) {
        exponentiation = Math.pow(c, b);
        return super.exponentiation(c, b);
    }

    @Override
    public double rootOfNumber(int a) {
        rootOfNumber = Math.sqrt(a);
        return super.rootOfNumber(a);
    }
}
