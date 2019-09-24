import org.junit.Test;

import static org.junit.Assert.*;

public class tarea_02Test {

    @Test
    public void printTest() {
        int expect = 2;
        assertEquals(expect,tarea_02.print(2));
    }
}