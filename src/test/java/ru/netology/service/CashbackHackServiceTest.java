package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        int amount = 900;
        int expected = 100;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actualBoundary = cashbackHackService.remain(amount);
        assertEquals(actualBoundary, expected);
    }
    @Test
    public void testRemainMax() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actualBoundary = cashbackHackService.remain(amount);
        assertEquals(actualBoundary, expected);
    }
}