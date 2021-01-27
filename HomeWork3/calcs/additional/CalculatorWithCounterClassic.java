package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    long i = 0;

    public void incementCountOperation (){
        i++;
    }

    public long getCountOperation(){
        return i;
    }
}
