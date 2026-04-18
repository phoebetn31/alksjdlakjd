/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.sanpham;

/**
 *
 * @author admin
 */
public class BangDia extends SanPham{
    private double doDaiPhat;

    public BangDia(String tenSP, double giaSP, double doDaiPhat) {
        super(tenSP, giaSP);
        this.doDaiPhat = doDaiPhat;
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("Do dai phat: %.1f phut\n", this.doDaiPhat);
    }
    
    
    /**
     * @return the doDaiPhat
     */
    public double getDoDaiPhat() {
        return doDaiPhat;
    }

    /**
     * @param doDaiPhat the doDaiPhat to set
     */
    public void setDoDaiPhat(double doDaiPhat) {
        this.doDaiPhat = doDaiPhat;
    }
}
