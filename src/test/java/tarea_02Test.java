import org.junit.Test;

import static org.junit.Assert.*;

public class tarea_02Test {

    static double [ ][ ] datosTesting = {
            {2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.6, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2},
            {4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1},
            {2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 2.9},
            {2.5, 3.0, 2.7, 3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 2.7, 3.8, 4.5, 2.3, 3.2, 3.1},
            {3.8, 4.0, 3.1, 4.5, 2.3, 3.2, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.5, 2.3, 3.2, 3.1, 2.5, 2.2, 2.5, 3.0, 2.7, 3.8, 4.0, 3.1}
    };

    @Test
    public void mayorSismo() {
        double expected1=4.6;
        double expected2=4.5;
        assertEquals(expected1, tarea_02.mayorSismo(datosTesting), 0);
        assertEquals(expected2, tarea_02.mayorSismo(datosTesting), 0);
    }

    @Test
    public void contarSismos() {
        int expected1=16;
        int expected2=5;
        assertEquals(expected1,tarea_02.contarSismos(datosTesting));
        assertEquals(expected2,tarea_02.contarSismos(datosTesting));

    }
}