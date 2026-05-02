/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.bth4.gamedatbom;

/**
 *
 * @author admin
 */
public class Tester {
    public static void main(String[] args) {
        NhanVat n1 = new NhanVat("Mario");
        NhanVat n2 = new NhanVat("Maria");
        NhanVat n3 = new NhanVat("Marib");
        
        VatPham v1 = new VPTangLuot("HeHe", 1);
        VatPham v2 = new VPTangMau("HeH", 2);
        VatPham v3 = new VPTangLuot("HHe", 2);
        
        n1.themVatPham(v1, v2);
        n2.themVatPham(v2, v3);
        n3.themVatPham(v3, v1);
        
        QuanLyNhanVat ql = new QuanLyNhanVat();
        ql.themNv(n1, n2, n3);
        ql.hienThi();
    }
}
