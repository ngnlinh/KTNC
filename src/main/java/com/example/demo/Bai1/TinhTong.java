package com.example.demo.Bai1;

public class TinhTong {
    public int tinhTong(Integer so1,Integer so2){
        if(so1 < 0 || so1 > 100 && so2 < 0 || so2 > 100){
            throw new IllegalArgumentException("So phai nay trong khoang tu 0-100");
        }

        if(so1 == null || so2 == null){
            throw new NullPointerException("Khong duoc de trong");
        }
        return so1+so2;
    }
}
