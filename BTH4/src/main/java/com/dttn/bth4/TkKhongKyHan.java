/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.bth4;

/**
 *
 * @author admin
 */
public class TkKhongKyHan extends TaiKhoan{

    public TkKhongKyHan(String ten, double soTien) {
        super(ten, soTien);
    }
    
    @Override
    public boolean isDaoHan() {
        return true;
    }

    @Override
    public double tinhTienLai() {
        return (this.soTien * 0.1)/(100);
    }
}
