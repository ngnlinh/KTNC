package com.example.demo.Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GiaiThuaTest {
    private GiaiThua giaiThua;
    @BeforeEach
    public void setUp(){
        giaiThua = new GiaiThua();
    }

    @Test
    public void testGt_bienDuoi(){
        Integer result = giaiThua.tinhGiaiThua(0);
        assertEquals(1, result);
    }

    @Test
    public void testGt_hopLe(){
        Integer result = giaiThua.tinhGiaiThua(5);
        assertEquals(120,result);
    }

    @Test
    public void testGt_am(){
        assertThrows(IllegalArgumentException.class, () -> {
            giaiThua.tinhGiaiThua(-3);
        });
    }

    @Test
    public void testGt_null(){
        assertThrows(NullPointerException.class,() ->{
            giaiThua.tinhGiaiThua(null);
        });
    }
}