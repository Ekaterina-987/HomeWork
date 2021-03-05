package home_work_2.arrays.arrays_task2_2_3New;

import arrays.arrays_task2_2_3New.DoWhileOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoWhileOperationTest {
    private final DoWhileOperation doWhile = new DoWhileOperation();

    @Test
    public void allElements(){
        int[] expectedArray = doWhile.allElements(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        int[] actualArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void everySecondElements(){
        int[] expectedArray = doWhile.everySecondElements(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        int[] actualArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(actualArray, expectedArray);
    }

    @Test
    public void reverseOrderElements(){
        int[] expectedArray = doWhile.reverseOrderElements(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        int[] actualArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedArray, actualArray);
    }
}
