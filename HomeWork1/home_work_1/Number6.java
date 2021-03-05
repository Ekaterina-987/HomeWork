package home_work_1;

public class Number6 {
    public static void main(String[] args) {

        String phoneNumber = createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(phoneNumber);
    }
    public static String createPhoneNumber(int[] n) {
        if (n.length == 10) {
            return String.format("(%d%d%d) %d%d%d-%d%d%d%d", n[0], n[1], n[2], n[3], n[4],
                    n[5], n[6], n[7], n[8], n[9]);
        } else {
            return "Ошибка. Массив должен состоять из десяти цифр.";
        }

    }
}
