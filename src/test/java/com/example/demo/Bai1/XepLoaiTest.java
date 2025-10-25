package com.example.demo.Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XepLoaiTest {
    private XepLoai tt;

    @BeforeEach
    public void setUp(){
        tt = new XepLoai();
    }

    @Test
    public void testXepLoai_hopLe(){
        String result = tt.xepLoai(6.0);
        assertEquals("Trung bình",result);
    }

    @Test
    public void testXepLoai_bienTren(){
        String result = tt.xepLoai(9.0);
        assertEquals("Xuất sắc",result);
    }

    @Test
    public void testXepLoai_bienDưới(){
        String result = tt.xepLoai(1.0);
        assertEquals("Yếu",result);
    }

    @Test
    public void testXepLoai_âm(){
        assertThrows(IllegalArgumentException.class,() ->{
            String result = tt.xepLoai(-1.0);
        });
    }

    @Test
    public void testXepLoai_null(){
        assertThrows(NullPointerException.class,() ->{
            String result = tt.xepLoai(null);
        });
    }
}