package loops_home;

public class loops_task1_5 {
    public static void main(String[] args) {
        int a;
        int b;
        for (a = 1; a <= 10; a++) {
            for (b = 2; b < 6; b++) {
                System.out.print(b + " x " + a + " = " + a * b + "   \t");
            }
            System.out.println("");
        }

        System.out.println(" ");
        for (a = 1; a <=10; a++){
            for (b = 6; b < 10; b++){
                System.out.print(b + " x " + a + " = " + a * b + "   \t");
            }
            System.out.println("");
        }
    }
}
