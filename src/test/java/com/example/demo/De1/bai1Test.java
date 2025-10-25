package com.example.demo.De1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bai1Test {
    private bai1 tt;

    @BeforeEach
    public void setUp(){
        tt = new bai1();
    }

    @Test
    public void testMang_hopLe(){
        int [] arr = {5,6,7,8};
        int ex =  26;
        int result = tt.sumArr(arr);
        assertEquals(ex,result);
    }

    @Test
    public void testMang_bienTren(){
        int [] arr = {999,998};
        int ex = 1997;
        int result = tt.sumArr(arr);
        assertEquals(ex,result);
    }

    @Test
    public void  testMang_bienDuoi(){
        int [] arr = {1,2,3};
        int ex = 6;
        int result = tt.sumArr(arr);
        assertEquals(ex,result);
    }

    @Test
    public void testMang_0(){
        assertThrows(NullPointerException.class,() -> {
            tt.sumArr(null);
        });
    }

    @Test
    public void testMang_am(){
        assertThrows(IllegalArgumentException.class,() -> {
            tt.sumArr(new int [] {-1,-2});
        });
    }
}