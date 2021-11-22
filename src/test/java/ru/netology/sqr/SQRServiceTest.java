package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sqrServiceTest {

    @Test
    void shouldSquareCounter() {
       SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.sqrt(200, 300);
        assertEquals(expected, actual);
    }

}