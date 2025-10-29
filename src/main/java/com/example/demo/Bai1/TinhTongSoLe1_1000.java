package com.example.demo.Bai1;

public class TinhTongSoLe1_1000 {
    public static int tinhTongSoLe(int start, int end) {
    if (start > end || start < 0 || end < 0) {
        throw new IllegalArgumentException("Khoảng không hợp lệ");
    }
    int tong = 0;
    for (int i = start; i <= end; i++) {
        if (i % 2 != 0) {
            tong += i;
        }
    }
    return tong;
}
}
