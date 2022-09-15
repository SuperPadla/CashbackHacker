package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void checkAmount0() {
        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkAmount1000() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkAmount990() {
        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkAmount1001() {
        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkAmount3500() {
        int actual = service.remain(3500);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }
}