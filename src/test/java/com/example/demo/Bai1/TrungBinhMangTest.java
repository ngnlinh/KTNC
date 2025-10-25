package com.example.demo.Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrungBinhMangTest {
    private TrungBinhMang tb;

    @BeforeEach
    public void setUp(){
        tb = new TrungBinhMang();
    }

    @Test
    public void testTTM_hopLe(){
        int [] arr = {5,1,5};
        int ex = 11;
        int result = tb.SumArr(arr);
        assertEquals(ex,result);
    }

    @Test
    public void testTTM_bienTren(){
        int [] arr = {10,10,10};
        int ex = 30;
        int result = tb.SumArr(arr);
        assertEquals(ex,result);
    }

    @Test
    public void testTTM_bienDuoi(){
        int [] arr = {1,0,0};
        int ex = 1;
        int result = tb.SumArr(arr);
        assertEquals(ex,result);
    }

    @Test
    public void testTTM_null(){
        assertThrows(NullPointerException.class,() ->{
            tb.SumArr(null);
        });
    }

    @Test
    public void testTTM_am(){
        assertThrows(IllegalArgumentException.class,() ->{
            tb.SumArr( new int[] {-1,-1,-1});
        });
    }
}