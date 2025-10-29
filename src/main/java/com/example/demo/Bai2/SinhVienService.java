package com.example.demo.Bai2;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> ds = new ArrayList<>();
    public Boolean add(SinhVien sinhVien){
        if(sinhVien.getTuoi()<=17||sinhVien.getTuoi()>=61){
            throw new IllegalArgumentException("Tuổi phải nằm trong khoảng từ 18-60 tuổi");
        }

        for (SinhVien sv : ds) {
            if (sv.getId().equalsIgnoreCase(sinhVien.getId())) {
                throw new IllegalArgumentException("ID đã tồn tại trong danh sách");
            }
        }
        return ds.add(sinhVien);
    }
    public Boolean update(String id, SinhVien sv){
        for(SinhVien sinhVien :ds){
            if(sinhVien.getId().equals(id)){
                if(sv.getId()==null){
                    throw new NullPointerException("Id không được để trống");
                }
                if(sv.getTen()==null){
                    throw new NullPointerException("Tên không được để trống");
                }
                if(sv.getTuoi()==null){
                    throw new NullPointerException("Tuổi không được để trống");
                }
                if(sv.getGioiTinh()==null){
                    throw new NullPointerException("Giới tính không được để trống");
                }

                if (sv.getTuoi() <= 17 || sv.getTuoi() >= 61) {
                    throw new IllegalArgumentException("Tuổi phải nằm trong khoảng từ 18-60 tuổi");
                }

                for (SinhVien other : ds) {
                    if (!other.getId().equals(id) && other.getId().equalsIgnoreCase(sv.getId())) {
                        throw new IllegalArgumentException("ID mới đã tồn tại cho sinh viên khác");
                    }
                }
                sinhVien.setId(sv.getId());
                sinhVien.setTen(sv.getTen());
                sinhVien.setTuoi(sv.getTuoi());
                sinhVien.setGioiTinh(sv.getGioiTinh());
                return true;
            }
        }
        return false;
    }

    public List<SinhVien> timKiem(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            throw new IllegalArgumentException("Từ khóa tìm kiếm không được để trống");
        }

        List<SinhVien> ketQua = new ArrayList<>();
        for (SinhVien sv : ds) {
            if (sv.getId().toLowerCase().contains(keyword.toLowerCase())
                    || sv.getTen().toLowerCase().contains(keyword.toLowerCase())) {
                ketQua.add(sv);
            }
        }

        return ketQua;
    }

}
