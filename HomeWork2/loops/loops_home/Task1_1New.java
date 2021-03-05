package loops_home;

public class Task1_1New {
    public static long multNumber(int a){
        long mult = 1;

        for (long i = 1; i <= a; i++) {
            mult = (int) (mult * i);
        }
        return mult;
    }
}
