package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actualBoundary = cashbackHackService.remain(amount);
        assertEquals(expected, actualBoundary);
    }

    @Test
    public void remainMinAmount() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actualBoundary = cashbackHackService.remain(amount);
        assertEquals(expected, actualBoundary);
    }

}