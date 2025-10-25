package com.example.demo.Bai1;

public class TrungBinhMang {
    public int SumArr (int [] arr ){
        if(arr == null){
            throw new NullPointerException("Khong duoc de trong");
        }

        for(int x :arr){
            if(x<0||x>100){
                throw new IllegalArgumentException("Mang trong khoang tu 0-100");
            }
        }

        int sum = 0;
        for(int numm :arr){
            sum+=numm;
        }
        return sum;

    }
}
