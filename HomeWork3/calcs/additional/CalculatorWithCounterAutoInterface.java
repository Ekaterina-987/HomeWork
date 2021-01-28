package home_work_3.calcs.additional;

public class CalculatorWithCounterAutoInterface implements ICalculator {
    public ICalculator iCalculator;

    long i = 0;

    public long getCountOperation(){
        return i;
    }

    public CalculatorWithCounterAutoInterface (ICalculator iCalculator){
        this.iCalculator = iCalculator;
    }
    @Override
    public double summ(double a1, double b1) {
        i++;
        return iCalculator.summ(a1, b1);
    }

    @Override
    public int diff(int a1, int b1) {
        i++;
        return iCalculator.diff(a1, b1);
    }

    @Override
    public double mult(int a1, int b1) {
        i++;
        return iCalculator.mult(a1, b1);
    }

    @Override
    public double division(int a1, int b1) {
        i++;
        return iCalculator.division(a1, b1);
    }

    @Override
    public int modul(int a1) {
        i++;
        return iCalculator.modul(a1);
    }

    @Override
    public double exponentiation(double c1, int b1) {
        i++;
        return iCalculator.exponentiation(c1, b1);
    }

    @Override
    public double rootOfNumber(int a1) {
        i++;
        return iCalculator.rootOfNumber(a1);
    }
}



