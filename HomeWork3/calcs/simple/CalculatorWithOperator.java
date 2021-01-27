package home_work_3.calcs.simple;

import home_work_3.calcs.additional.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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

    public int modul(int a){
        if (a < 0){
            modul = a * -1;
        }else{
            modul = a;
        }
        return modul;
    }

    public double exponentiation (double c, int b){
        double result = 1;
        for (double i = 1; i <= b; i++){
            result *= c;
        }
        exponentiation = result;
        return exponentiation;
    }

    public double rootOfNumber(int a){
        rootOfNumber = Math.sqrt(a);
        return rootOfNumber;
    }


}
