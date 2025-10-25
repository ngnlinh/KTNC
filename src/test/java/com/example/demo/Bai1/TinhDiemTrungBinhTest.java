package com.example.demo.Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhDiemTrungBinhTest {
    private TinhDiemTrungBinh tt;

    @BeforeEach
    public void setUp(){
        tt = new TinhDiemTrungBinh();
    }

    @Test
    public void testTDTB_hopLe(){
        Double result = tt.tinhDiemTrungBinh(10.0,7.0,4.0);
        assertEquals(7,result);
    }

    @Test
    public void testTDTB_bienTren(){
        Double result = tt.tinhDiemTrungBinh(10.0,10.0,10.0);
        assertEquals(10,result);
    }

    @Test
    public void testTDTB_bienDuoi(){
        Double result = tt.tinhDiemTrungBinh(0.0,0.0,0.0);
        assertEquals(0,result);
    }

    @Test
    public void testTDTB_trong(){
        assertThrows(NullPointerException.class,() -> {
            tt.tinhDiemTrungBinh(null,null,null);
        });
    }

    @Test
    public void testTDTB_am(){
        assertThrows(IllegalArgumentException.class,() -> {
            tt.tinhDiemTrungBinh(-1.0,-2.0,-3.0);
        });
    }

}