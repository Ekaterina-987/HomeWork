package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Number4Test {
    private final Number4 numb4 = new Number4();

    @Test
    public void sleepIn(){
            assertEquals(numb4.sleepIn (false, false), true);
            assertEquals(numb4.sleepIn (true, false), false);
            assertEquals(numb4.sleepIn (false, true), true);
        }

}
