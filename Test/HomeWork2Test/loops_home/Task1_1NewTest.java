package home_work_2.loops_home;

import loops_home.Task1_1New;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1_1NewTest {
    private final loops_home.Task1_1New task1_1 = new Task1_1New();

    @Test
    public void loops(){
        assertEquals(120, task1_1.multNumber(5));
    }
}
