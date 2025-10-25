package com.example.demo.Bai1;

public class TongMang1_1000 {
    public int sumArr(int arr []){
        for(int x:arr){
            if(x<=1||x>=1000){
                throw new IllegalArgumentException("Mang phai la so tu 1-1000");
            }
        }

        if(arr == null){
            throw new NullPointerException("Khong duoc de trong mang");
        }

        int sum = 0;
        for (int x :arr){
            if (x>=1 && x<=1000){
                sum += x;
            }
        }
        return sum;
    }
}
