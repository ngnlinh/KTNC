package com.example.demo.De1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienService1Test {
    private SinhVienService1 tt;

    @BeforeEach
    public void setUp(){
        tt = new SinhVienService1();
    }

    @Test
    public void testAdd_hopLe(){
        SinhVien1 sinhVien1 = new SinhVien1("Sv01","Nguyen Van A",17,8f,25,"CNTT");
        assertTrue(tt.add(sinhVien1));
    }

    @Test
    public void testAdd_diemAm(){
        assertThrows(IllegalArgumentException.class,() -> {
            tt.add(new SinhVien1("Sv01","Nguyen Van A",17,-8f,25,"CNTT"));
        });
    }

    @Test
    public void testAdd_trong(){
        assertThrows(NullPointerException.class,() -> {
            tt.add(new SinhVien1(null,"Nguyen Van A",17,-8f,25,"CNTT"));
        });
    }

    @Test
    public void testUpdate_hopLe(){
        SinhVien1 sinhVien1 = new SinhVien1("Sv02","Nguyen Van A",17,7f,25,"CNTT");
        tt.add(sinhVien1);
        SinhVien1 sinhVienMoi = new SinhVien1("Sv02","Nguyen Van B",17,7f,25,"CNTT");
        assertTrue(tt.update("Sv02",sinhVienMoi));
    }

    @Test
    public void testUpdate_diemAm(){
        SinhVien1 sinhVien1 = new SinhVien1("Sv02","Nguyen Van A",17,7f,25,"CNTT");
        tt.add(sinhVien1);
        assertThrows(IllegalArgumentException.class,() -> {
            SinhVien1 sinhVienMoi = new SinhVien1("Sv02","Nguyen Van B",17,-7f,25,"CNTT");
            tt.update("Sv02", sinhVienMoi);
        });
    }
}