package com.example.demo.Bai1;

public class TinhDiemTrungBinh {
    public Double tinhDiemTrungBinh (Double toan,Double ly,Double hoa){
        if(toan == null && ly == null && hoa == null){
            throw new NullPointerException("Khong duoc de trong");
        }

        double sum = 0;
        int dem = 0 ;

        if(toan != null){
            if(toan<0||toan>10){
                throw new IllegalArgumentException("Diem toan khong hop le");
            }
            sum+=toan;
            dem++;
        }

        if(ly != null){
            if(ly<0||ly>10){
                throw new IllegalArgumentException("Diem ly khong hop le");
            }
            sum+=ly;
            dem++;
        }

        if(hoa != null){
            if(hoa<0||hoa>10){
                throw new IllegalArgumentException("Diem hoa khong hop le");
            }
            sum+=hoa;
            dem++;
        }
        return sum/dem;
    }
}
