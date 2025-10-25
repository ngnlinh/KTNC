package com.example.demo.Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TongMang1_1000Test {
    private TongMang1_1000 tongMang1_1000;

    @BeforeEach
    public void setUp(){
        tongMang1_1000 = new TongMang1_1000();
    }

    @Test
    public void testMang_hopLe(){
        int [] arr = {1,2,3,4,5};
        int x = 5;
        int result = tongMang1_1000.sumArr(arr);
        assertEquals(x,result);
    }

}