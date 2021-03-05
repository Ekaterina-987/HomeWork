package home_work_1;

public class Number4 {
    public static void main(String[] args) {
        boolean sleepIn = sleepIn(true, false);
        if(sleepIn){
            System.out.println("Можем спать дальше!");
        }else {
            System.out.println("Пора вставать на работу.");
        }
    }
    public static boolean sleepIn(boolean weekday, boolean vacation){
        return !weekday || vacation;
    }
}
