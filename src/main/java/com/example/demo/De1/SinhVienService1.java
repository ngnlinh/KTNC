package com.example.demo.De1;

import com.example.demo.Bai2.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService1 {
    private List<SinhVien1> ds = new ArrayList<>();
    public Boolean add(SinhVien1 sinhVien1){
        if(sinhVien1.getMaSV() == null || sinhVien1.getTuoi() == null || sinhVien1.getTen() == null || sinhVien1.getChuyenNganh() == null || sinhVien1.getKyHoc() == null || sinhVien1.getDiemTrungBinh() == null){
            throw new NullPointerException("Không được để trống");
        }
        if(sinhVien1.getDiemTrungBinh()<0 || sinhVien1.getDiemTrungBinh()>10){
            throw new IllegalArgumentException("Diem trung binh nam trong khoang tu 0-10");
        }
        return ds.add(sinhVien1);
    }
    public Boolean update(String maSv, SinhVien1 sv){
        for(SinhVien1 sinhVien1:ds){
            if(sinhVien1.getMaSV().equals(maSv)){
                if(sv.getMaSV() == null && sv.getTuoi() == null && sv.getTen() == null && sv.getChuyenNganh() == null && sv.getKyHoc() == null && sv.getDiemTrungBinh() == null){
                    throw new NullPointerException("Không được để trống");
                }
                if(sv.getDiemTrungBinh()<0 || sv.getDiemTrungBinh()>10){
                    throw new IllegalArgumentException("Diem trung binh nam trong khoang tu 0-10");
                }
                sinhVien1.setMaSV(sv.getMaSV());
                sinhVien1.setTen(sv.getTen());
                sinhVien1.setTuoi(sv.getTuoi());
                sinhVien1.setChuyenNganh(sv.getChuyenNganh());
                sinhVien1.setDiemTrungBinh(sv.getDiemTrungBinh());
                sinhVien1.setKyHoc(sv.getKyHoc());
                return true;
            }
        }
        return false;
    }
}
