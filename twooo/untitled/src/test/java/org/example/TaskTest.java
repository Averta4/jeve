package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {

    @Test
    public void testTaskTitle() {
        Task task = new Task("Сделать домашку");
        assertEquals("Сделать домашку", task.toString());
    }

    @Test
    public void testAnotherTaskTitle() {
        Task task = new Task("Купить хлеб");
        assertEquals("Купить хлеб", task.toString());
    }
}