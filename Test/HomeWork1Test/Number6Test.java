package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Number6Test {
    private final Number6 numb6 = new Number6();

    @Test
    public void createPhoneNumber(){
        assertEquals(numb6.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}), "(123) 456-7890");
        assertEquals(numb6.createPhoneNumber(new int[] {0, 9, 8, 7, 6, 5, 4, 3, 2, 1}), "(098) 765-4321");
    }
}
