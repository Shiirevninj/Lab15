package com.nar.lab15;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class DivisionTest {

    @Test
    public void testDivideNormal() {
        Division calc = new Division();
        assertEquals(2.0, calc.divide(4.0, 2.0), 0.0001);
    }

    @Test
    public void testDivideByZero() {
    Division calc = new Division();
    IllegalArgumentException exception = assertThrows(
        IllegalArgumentException.class,
        () -> calc.divide(4.0, 0.0)
    );
    assertEquals("Тоог 0-д хуваах боломжгүй", exception.getMessage());
}

}
