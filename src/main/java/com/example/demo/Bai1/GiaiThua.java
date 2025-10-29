package com.example.demo.Bai1;

public class GiaiThua {
    public Integer tinhGiaiThua(Integer  n){
        if (n == null) {
            throw new NullPointerException("Giá trị đầu vào không được null!");
        }
        if (n < 0) {
            throw new IllegalArgumentException("Không tính giai thừa cho số âm!");
        }
        int ketQua = 1;
        for (int i = 1; i <= n; i++) {
            ketQua *= i;
        }
        return ketQua;

    }
}
