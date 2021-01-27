package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long i;

    @Override
    public int modul(int a) {
        i++;
        return super.modul(a);
    }

    @Override
    public double exponentiation(double c, int b) {
        i++;
        return super.exponentiation(c, b);
    }

    @Override
    public double rootOfNumber(int a) {
        i++;
        return super.rootOfNumber(a);
    }

    @Override
    public double summ(double a, double b) {
        i++;
        return super.summ(a, b);
    }

    @Override
    public int diff(int a, int b) {
        i++;
        return super.diff(a, b);
    }

    @Override
    public double mult(int a, int b) {
        i++;
        return super.mult(a, b);
    }

    @Override
    public double division(int a, int b) {
        i++;
        return super.division(a, b);
    }

    public long getCountOperation(){
        return i;
    }
}
