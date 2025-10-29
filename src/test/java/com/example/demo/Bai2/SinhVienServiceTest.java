package com.example.demo.Bai2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    private SinhVienService sinhVienService;

    @BeforeEach
    public void setUp() {
        sinhVienService = new SinhVienService();
        sinhVienService.add(new SinhVien("SV01", "Nguyễn Ngọc Linh", true, 20));
        sinhVienService.add(new SinhVien("SV02", "Minh Anh", false, 22));
        sinhVienService.add(new SinhVien("SV03", "Tuấn Anh", true, 21));
    }

    // --- Test cho add() và update() của Linh ---
    @Test
    public void testAdd_hopLe() {
        SinhVien sinhVien = new SinhVien("1", "Nguyen Van A", true, 20);
        assertTrue(sinhVienService.add(sinhVien));
    }

    @Test
    public void testAdd_bienTren() {
        SinhVien sinhVien = new SinhVien("2", "Nguyen Van A", true, 60);
        assertTrue(sinhVienService.add(sinhVien));
    }

    @Test
    public void testAdd_bienDuoi() {
        SinhVien sinhVien = new SinhVien("3", "Nguyen Van A", true, 18);
        assertTrue(sinhVienService.add(sinhVien));
    }

    @Test
    public void testAdd_tuoila0() {
        SinhVien sinhVien = new SinhVien("4", "Nguyen Van A", true, 0);
        assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.add(sinhVien);
        });
    }

    @Test
    public void testAdd_tuoilaam() {
        SinhVien sinhVien = new SinhVien("5", "Nguyen Van A", true, -10);
        assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.add(sinhVien);
        });
    }

    @Test
    public void testUpdate_hopLe() {
        SinhVien sinhVien = new SinhVien("2", "Nguyen Van A", true, 60);
        sinhVienService.add(sinhVien);
        SinhVien sinhVienMoi = new SinhVien("2", "Nguyen Van A", false, 60);
        assertTrue(sinhVienService.update("2", sinhVienMoi));
    }

    @Test
    public void testUpdate_trongTen() {
        SinhVien sinhVien = new SinhVien("1", "Nguyen Van A", true, 18);
        sinhVienService.add(sinhVien);
        SinhVien sinhVienMoi = new SinhVien("1", null, true, 18);
        assertThrows(NullPointerException.class, () -> {
            sinhVienService.update("1", sinhVienMoi);
        });
    }


    @Test
    public void testTimKiem_theoTen() {
        List<SinhVien> ketQua = sinhVienService.timKiem("Anh");
        assertEquals(2, ketQua.size()); // Minh Anh, Tuấn Anh
    }

    @Test
    public void testTimKiem_theoId() {
        List<SinhVien> ketQua = sinhVienService.timKiem("SV01");
        assertEquals(1, ketQua.size());
        assertEquals("Nguyễn Ngọc Linh", ketQua.get(0).getTen());
    }

    @Test
    public void testTimKiem_khongCoKetQua() {
        List<SinhVien> ketQua = sinhVienService.timKiem("Không tồn tại");
        assertTrue(ketQua.isEmpty());
    }

    @Test
    public void testTimKiem_nhapRong() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.timKiem("   ");
        });
        assertEquals("Từ khóa tìm kiếm không được để trống", ex.getMessage());
    }

    @Test
    public void testTimKiem_nhapNull() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            sinhVienService.timKiem(null);
        });
        assertEquals("Từ khóa tìm kiếm không được để trống", ex.getMessage());
    }
}