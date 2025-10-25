package com.example.demo.Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TongHaiChuTest {
    public TongHaiChu tt;

    @BeforeEach
    public void setUp(){
        tt = new TongHaiChu();
    }

    @Test
    public void testTongHaiChu_hopLe(){
        String result = tt.tongHaiChu("Hello","Linh");
        assertEquals("HelloLinh",result);
    }

    @Test
    public void testTongHaiChu_trongStr1(){
        assertThrows(NullPointerException.class,() -> {
            tt.tongHaiChu(null,"Linh");
        });
    }

    @Test
    public void testTongHaiChu_trongStr2(){
        assertThrows(NullPointerException.class,() -> {
            tt.tongHaiChu("Hello",null);
        });
    }


}