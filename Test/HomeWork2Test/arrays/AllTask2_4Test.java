package home_work_2.arrays;

import arrays.AllTask2_4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllTask2_4Test {
    private final AllTask2_4 task2_4 = new AllTask2_4();

    @Test
    public void summEventElement(){
        assertEquals(10, task2_4.summEvenElements(new int[]{1, -7, 8, -6, 2, 9}));
    }

    @Test
    public void maxEventElements(){
        assertEquals(8, task2_4.maxEvenElements(new int[]{1, -7, 8, -6, 2, 9}));
    }

    @Test
    public void lessThanArithmeticMean(){
        int[] actualArray = task2_4.lessThanArithmeticMean(new int[] {13, 55, 24, 82, 1});
        int[] expectedArray = new int[] {13, 55, 24, 82, 1};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void twoSmallElements(){
        int[] actualArray = task2_4.twoSmallElements(new int[] {69, -58, 83, 11, 47, 1, 34});
        int[] expectedArray = new int[] {69, -58, 83, 11, 47, 1, 34};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void compressArray(){
        int[] actualArray = task2_4.compressArray(new int[] {45, 11, 59, 36, 85, 73, 29});
        int[] expectedArray = new int[] {11, 85, 73, 0, 0, 0, 0};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void summNumberArray(){
        assertEquals(26, task2_4.summNumberArray(new int[]{8, 61, 14, 33}));
    }
}
