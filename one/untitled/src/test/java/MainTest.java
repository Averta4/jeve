package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testChild() {
        assertEquals("ребенок", Main.getAgeGroup(10));
    }

    @Test
    public void testAdult() {
        assertEquals("взрослый", Main.getAgeGroup(25));
    }

    @Test
    public void testPensioner() {
        assertEquals("пенсионер", Main.getAgeGroup(65));
    }
}