/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.sanpham;

/**
 *
 * @author admin
 */
public class Sach extends SanPham{
    private int soTrang;

    public Sach(String tenSP, double giaSP, int soTrang) {
        super(tenSP, giaSP);
        this.soTrang = soTrang;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("So trang: %d\n", this.soTrang);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
    
}
