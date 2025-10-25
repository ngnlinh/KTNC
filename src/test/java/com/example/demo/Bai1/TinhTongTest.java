package com.example.demo.Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    private TinhTong tt;
    @BeforeEach
    public void setUp(){
        tt = new TinhTong();
    }

    @Test
    public void testTinhTong_hopLe(){
        Integer result = tt.tinhTong(5,5);
        assertEquals(10,result);
    }

    @Test
    public void testTinhTong_bienTren(){
        Integer result = tt.tinhTong(99,98);
        assertEquals(197,result);
    }

    @Test
    public void testTinhTong_bienDuoi(){
        Integer result = tt.tinhTong(0,1);
        assertEquals(1,result);
    }

    @Test
    public void testTinhTong_null(){
        assertThrows(NullPointerException.class,() -> {
            tt.tinhTong(null,null);
        });
    }

    @Test
    public void testTinhTong_soAm(){
        assertThrows(IllegalArgumentException.class,() -> {
            tt.tinhTong(-1,-1);
        });
    }

}