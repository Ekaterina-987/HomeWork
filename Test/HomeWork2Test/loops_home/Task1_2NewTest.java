package home_work_2.loops_home;

import loops_home.Task1_2New;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1_2NewTest {
    private final Task1_2New task1_2 = new Task1_2New();

    @Test
    public void multiplyNumbers (){
        assertEquals(10080, task1_2.multiplayNumbers(181232375));
        assertEquals(36, task1_2.multiplayNumbers(1326));
    }
}
