package com.example.demo.Bai2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    private SinhVienService sinhVienService;

    @BeforeEach
    public void setUp(){
        sinhVienService = new SinhVienService();
    }

    @Test
    public void testAdd_hopLe(){
        SinhVien sinhVien = new SinhVien("1","Nguyen Van A",true,20);
        assertTrue(sinhVienService.add(sinhVien));
    }

    @Test
    public void testAdd_bienTren(){
        SinhVien sinhVien = new SinhVien("2","Nguyen Van A",true,60);
        assertTrue(sinhVienService.add(sinhVien));
    }

    @Test
    public void testAdd_bienDuoi(){
        SinhVien sinhVien = new SinhVien("3","Nguyen Van A",true,18);
        assertTrue(sinhVienService.add(sinhVien));
    }

    @Test
    public void testAdd_tuoila0(){
        SinhVien sinhVien = new SinhVien("4","Nguyen Van A",true,0);
        assertThrows(IllegalArgumentException.class,() -> {
            sinhVienService.add(sinhVien);
        });
    }

    @Test
    public void testAdd_tuoilaam(){
        SinhVien sinhVien = new SinhVien("5","Nguyen Van A",true,-10);
        assertThrows(IllegalArgumentException.class,() -> {
            sinhVienService.add(sinhVien);
        });
    }

    @Test
    public void testUpdate_hopLe(){
        SinhVien sinhVien = new SinhVien("2","Nguyen Van A",true,60);
        sinhVienService.add(sinhVien);
        SinhVien sinhVienMoi = new SinhVien("2","Nguyen Van A",false,60);
        assertTrue(sinhVienService.update("2",sinhVienMoi));
    }

    @Test
    public void testUpdate_trongTen(){
        SinhVien sinhVien = new SinhVien("1","Nguyen Van A",true,18);
        sinhVienService.add(sinhVien);
        SinhVien sinhVienMoi = new SinhVien("1",null,true,18);
        assertThrows(NullPointerException.class,() -> {
            sinhVienService.update("1",sinhVienMoi);
        });
    }





}