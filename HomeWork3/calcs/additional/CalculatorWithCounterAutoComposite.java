package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    long i = 0;

    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounterAutoComposite (CalculatorWithOperator calculatorWithOperator){
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathCopy calculatorWithMathCopy){
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoComposite (CalculatorWithMathExtends calculatorWithMathExtends){
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    public long getCountOperation(){
        return i;
    }

    public double summ(double a, double b){
        i++;
        if (calculatorWithOperator != null){
            return calculatorWithOperator.summ(a, b);
        }else if (calculatorWithMathCopy != null){
            return calculatorWithMathCopy.summ(a, b);
        }else {
            return calculatorWithMathExtends.summ(a, b);
        }
    }

    public int diff(int a, int b){
        i++;
        if (calculatorWithOperator != null){
            return calculatorWithOperator.diff(a, b);
        }else if (calculatorWithMathCopy != null){
            return calculatorWithMathCopy.diff(a, b);
        }else {
            return calculatorWithMathExtends.diff(a, b);
        }
    }

    public double mult(int a, int b){
        i++;
        if (calculatorWithOperator != null){
            return calculatorWithOperator.mult(a, b);
        }else if (calculatorWithMathCopy != null){
            return calculatorWithMathCopy.mult(a, b);
        }else {
            return calculatorWithMathExtends.mult(a, b);
        }
    }

    public double division(int a, int b){
        i++;
        if (calculatorWithOperator != null){
            return calculatorWithOperator.division(a, b);
        }else if (calculatorWithMathCopy != null){
            return calculatorWithMathCopy.diff(a, b);
        }else {
            return calculatorWithMathExtends.diff(a, b);
        }
    }

    public int modul(int a){
        i++;
        if (calculatorWithOperator != null){
            return calculatorWithOperator.modul(a);
        }else if (calculatorWithMathCopy != null){
            return calculatorWithMathCopy.modul(a);
        }else {
            return calculatorWithMathExtends.modul(a);
        }
    }

    public double exponentiation(double c, int b){
        i++;
        if (calculatorWithOperator != null){
            return calculatorWithOperator.exponentiation(c, b);
        }else if (calculatorWithMathCopy != null){
            return calculatorWithMathCopy.exponentiation(c, b);
        }else {
            return calculatorWithMathExtends.exponentiation(c, b);
        }
    }

    public double rootOfNumber(int a){
        i++;
        if (calculatorWithOperator != null){
            return calculatorWithOperator.rootOfNumber(a);
        }else if (calculatorWithMathCopy != null){
            return calculatorWithMathCopy.rootOfNumber(a);
        }else {
            return calculatorWithMathExtends.rootOfNumber(a);
        }
    }

}
