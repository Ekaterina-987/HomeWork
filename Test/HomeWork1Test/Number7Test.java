package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Number7Test {
    private final Number7 numb7 = new Number7();

    @Test
    public void toBinaryString(){
        assertEquals(numb7.toBinaryString((byte) 15), "00001111");
        assertEquals(numb7.toBinaryString((byte) -15), "11110001");
        assertEquals(numb7.toBinaryString((byte) 42), "00101010");
        assertEquals(numb7.toBinaryString((byte) -42), "11010110");
    }
}
