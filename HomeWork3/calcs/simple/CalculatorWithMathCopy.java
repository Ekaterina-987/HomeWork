package home_work_3.calcs.simple;

import home_work_3.calcs.additional.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    int diff, modul;
    double summ, mult, division, exponentiation, rootOfNumber;

    public double summ (double a, double b){
        summ = a + b;
        return summ;
    }

    public int diff (int a, int b){
        diff = a - b;
        return diff;
    }

    public double mult (int a, int b){
        mult = (double) a * b;
        return mult;
    }

    public double division(int a, int b){
        division = (double) a / b;
        return division;
    }
    public double exponentiation (double c, int b){
        exponentiation = Math.pow(c,b);
        return exponentiation;
    }

    public int modul(int a){
        modul = Math.abs(a);
        return modul;
    }

    public double rootOfNumber(int a){
        rootOfNumber = Math.sqrt(a);
        return rootOfNumber;
    }
}
