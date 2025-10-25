package com.example.demo.De1;

public class bai1 {
    public int sumArr(int [] arr){
        if(arr == null){
            throw new NullPointerException("Không được để trống mảng");
        }
        for(int x :arr){
            if(x<1||x>1000){
                throw new IllegalArgumentException("Mảng phải nằm trong khoảng 1-1000");
            }
        }
        int sum = 0;
        for(int x: arr){
            if(x>1||x<1000){
                sum += x;
            }
        }
        return sum;
    }
}
