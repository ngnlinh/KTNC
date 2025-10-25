package com.example.demo.Bai1;

public class TongHaiChu {
    public String tongHaiChu(String str1,String str2){
        if(str1 == null || str2 == null){
            throw new NullPointerException("Khong duoc de trong");
        }
        return str1+str2;
    }
}
