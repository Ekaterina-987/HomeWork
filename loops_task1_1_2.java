package loops_home;
// Рекурсия
public class loops_task1_1_2 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
            int a = Integer.parseInt(arg);
            System.out.println("1 = " + recursion(a));
        }
    }
    public static int recursion(int a){
        if(a == 1) {
            return 1;
        }
        System.out.print(a + " * ");
        return recursion(a - 1) * a;
    }
}
