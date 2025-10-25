package com.example.demo.Bai1;

public class XepLoai {
    public String xepLoai(Double diemTB){
        if(diemTB == null ){
            throw new NullPointerException("Không được để trống");
        }

        if(diemTB<0 || diemTB>10){
            throw new IllegalArgumentException("Diem trung binh phai nam trong khoang tu 0-10");
        }

        if(diemTB >=8){
            return "Xuat sac";
        }else if(diemTB >=7){
            return "Khá";
        }else if(diemTB >=5){
            return "Trung bình";
        }else{
            return "Yếu";
        }
    }
}
