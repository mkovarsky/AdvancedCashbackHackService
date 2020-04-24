package ru.netology.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceParameterizedTest {

    CashbackHackService service = new CashbackHackService();

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCheckRemain(String test, int amount, int expected) {
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
