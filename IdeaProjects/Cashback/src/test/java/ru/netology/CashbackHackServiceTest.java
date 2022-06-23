package ru.netology;

import  org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CashbackHackServiceTest {
    @org.testng.annotations.Test
    void showWorkCashback(){
        int boundary = 2000;
        int amount = 10;
        int expected = 1000;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);

        assertEquals(actual,expected);

    }

    @org.testng.annotations.Test
    void showWorkCashback2(){
        int boundary = 900;
        int amount = 10;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);

        assertEquals(actual,expected);


    }


    @org.testng.annotations.Test
    void showWorkCashback3(){
        int boundary = 1000;
        int amount = 10;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);

        assertEquals(actual,expected);


    }


}