package home_work_2.arrays.arrays_task2_2_3New;

import arrays.arrays_task2_2_3New.ForEachOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ForOperationTest {
    private final ForEachOperation forOperation = new ForEachOperation();

    @Test
    public void allElements(){
        int[] expectedArray = forOperation.allElements(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        int[] actualArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void everySecondElements(){
        int[] expectedArray = forOperation.everySecondElements(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        int[] actualArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void reverseOrderElements(){
        int[] expectedArray = forOperation.reverseOrderElements(new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        int[] actualArray = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedArray, actualArray);
    }
}
