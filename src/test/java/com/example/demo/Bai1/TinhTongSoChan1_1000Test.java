package com.example.demo.Bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TinhTongSoChan1_1000Test {
    private TinhTongSoChan1_1000 tinhTongSoChan;

    @BeforeEach
    void setUp() {
        tinhTongSoChan = new TinhTongSoChan1_1000();
    }

    @Test
    void testHopLe_1000() {
        Integer result = tinhTongSoChan.tinhTongSoChan(1000);
        assertEquals(250500, result); // Kết quả đúng là 250500
    }

    @Test
    void testHopLe_10() {
        Integer result = tinhTongSoChan.tinhTongSoChan(10);
        assertEquals(30, result); // 2 + 4 + 6 + 8 + 10 = 30
    }

    @Test
    void testHopLe_1() {
        Integer result = tinhTongSoChan.tinhTongSoChan(1);
        assertEquals(0, result); // Không có số chẵn nào <= 1
    }

    @Test
    void testNhapNull() {
        Exception ex = assertThrows(NullPointerException.class, () -> {
            tinhTongSoChan.tinhTongSoChan(null);
        });
        assertEquals("Không được để trống giá trị n", ex.getMessage());
    }

    @Test
    void testNhapSoAm() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            tinhTongSoChan.tinhTongSoChan(-5);
        });
        assertEquals("Giá trị n phải lớn hơn hoặc bằng 1", ex.getMessage());
    }

    @Test
    void testNhap0() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            tinhTongSoChan.tinhTongSoChan(0);
        });
        assertEquals("Giá trị n phải lớn hơn hoặc bằng 1", ex.getMessage());
    }
}