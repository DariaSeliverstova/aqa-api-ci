package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    void showWorkCashback(){
        int boundary = 2000;
        int amount = 10;
        int expected = 1000;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);

        assertEquals(expected,actual);

    }

    @Test
    void showWorkCashback2(){
        int boundary = 900;
        int amount = 10;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);

        assertEquals(expected,actual);


    }

    @Test
    void showWorkCashback3(){
        int boundary = 1000;
        int amount = 10;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(boundary);

        assertEquals(expected,actual);


    }



}
