package com.example.demo.Bai1;

public record TinhTongSoLe1_100() {
    public Integer tong(Integer x) {
        if(x == null){
            throw new IllegalArgumentException("Không được để trống");
        }
        if(x<1){
            throw new IllegalArgumentException("Phải lớn hơn 1");
        }
        return x;
    }
}
