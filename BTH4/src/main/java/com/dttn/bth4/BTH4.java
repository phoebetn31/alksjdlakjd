/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.dttn.bth4;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class BTH4 {

    public static void main(String[] args) {
        TaiKhoan tk1 = new TkKhongKyHan("Dang Thi Tam Nhan", 15000);
        TaiKhoan tk2 = new TkKyHan("Dang Minh Quan", 25000, KyHan.MOT_TUAN);
        TaiKhoan tk3 = new TkKyHan("Le Thi Be", 16000, KyHan.MOT_THANG);
        TaiKhoan tk4 = new TkKyHan("Dang Van Dan", 27000, KyHan.MOT_NAM);
        
        QuanLyTaiKhoan ql = new QuanLyTaiKhoan();
        tk1.nopTien(2000);
        ((TkKyHan) tk2).setNgayDaoHan(LocalDate.now());
        tk2.nopTien(1500);
        ql.themTk(tk1, tk2, tk3, tk4);
        ql.hienThi();
        
        System.out.println();
        ql.xemTienLai();
    }
}
