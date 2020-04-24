package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldRemain0() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemain1000() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    void shouldRemain200() {
        int actual = service.remain(800);
        int expected = 200;
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> service.remain(0));
    }
}
