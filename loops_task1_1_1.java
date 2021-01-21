package loops_home;

// Перемножить числа от 1 до числа (включительно), введенного пользователем через аргумент к
// исполняемой программе.
public class loops_task1_1_1 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
            long a = Integer.parseInt(arg);
            long mult = 1;

            for (long i = 1; i <= a; i++) {
                mult = mult * i;
                System.out.print(i + " * ");
            }
            System.out.println("= " + mult);
        }
    }
}
