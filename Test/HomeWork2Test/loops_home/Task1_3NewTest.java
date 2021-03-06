package home_work_2.loops_home;

import loops_home.Task1_3New;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1_3NewTest {
    private final Task1_3New task1_3 = new Task1_3New();
    
    @Test
    public void exponentNumber(){
        assertEquals(1889568.0, task1_3.exponentNumber(18.0, 5));
        assertEquals(56.25, task1_3.exponentNumber(7.5, 2));
        assertEquals(18.49, task1_3.exponentNumber(4.3, 2));
    }
}
