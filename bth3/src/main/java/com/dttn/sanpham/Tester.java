/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.sanpham;

/**
 *
 * @author admin
 */
public class Tester {
    public static void main(String[] args) {
        SanPham s1 = new Sach("Hat giong tam hon", 140, 96);
        SanPham s2 = new BangDia("Titanaic", 99, 190);
        SanPham s3 = new Sach("Lap trinh OOP", 200, 167);
        SanPham s4 = new BangDia("Lap trinh OOP", 150, 74);
        SanPham s5 = new Sach("Titanaic", 200, 95);
        
        QuanLySanPham ql = new QuanLySanPham();
        ql.themSP(s1,s2,s3, s4, s5);
        ql.hienThi();
        
        
        System.out.println();
        ql.sapXep2();
        ql.hienThi();
        
        System.out.println("=======TIM KIEM=======");
        ql.timKiem("P").forEach(s -> s.hienThi());
        
        System.out.println("=======TIM KIEM LOAI=======");
        ql.timKiem("com.dttn.sanpham.Sach").forEach(s -> s.hienThi());
        
//        System.out.println("=======XOA SP=======");
//        ql.xoaSP(1);
//        ql.hienThi();
//        ql.xoaSP("Lap trinh OOP");
//        ql.hienThi();
    }
}
