package com.example.demo.Bai1;

public class TinhTongSoChan1_1000 {
    public Integer tinhTongSoChan(Integer n) {
        if (n == null) {
            throw new NullPointerException("Không được để trống giá trị n");
        }

        if (n < 1) {
            throw new IllegalArgumentException("Giá trị n phải lớn hơn hoặc bằng 1");
        }

        int tong = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                tong += i;
            }
        }

        return tong;
    }
}
