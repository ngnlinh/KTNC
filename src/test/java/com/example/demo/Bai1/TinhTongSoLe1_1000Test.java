package com.example.demo.Bai1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongSoLe1_1000Test {
    TinhTongSoLe1_1000 TongSoLe = new TinhTongSoLe1_1000();
    @Test
    void testTongHopLe_1_1000() {
        int result = TongSoLe.tinhTongSoLe(1, 1000);
        assertEquals(250000, result);
    }

    @Test
    void testBienDuoi_1_1() {
        int result = TongSoLe.tinhTongSoLe(1, 1);
        assertEquals(1, result);
    }

    @Test
    void testBienTren_999_1000() {
        int result = TongSoLe.tinhTongSoLe(999, 1000);
        assertEquals(999, result);
    }

    @Test
    void testStartLonHonEnd() {
        assertThrows(IllegalArgumentException.class, () -> {
            TongSoLe.tinhTongSoLe(100, 1);
        });
    }

    @Test
    void testStartAm() {
        assertThrows(IllegalArgumentException.class, () -> {
            TongSoLe.tinhTongSoLe(-5, 10);
        });
    }

}