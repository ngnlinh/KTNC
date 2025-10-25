package com.example.demo.Bai2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
    private String id;
    private String ten;
    private Boolean gioiTinh;
    private Integer tuoi;
}
