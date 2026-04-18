/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.sanpham;

/**
 *
 * @author admin
 */
public abstract class SanPham {
    private static int dem;
    private int id = ++dem;
    private String tenSP;
    private double giaSP;

    public SanPham(String tenSP, double giaSP) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
    }

    public void hienThi(){
        System.out.printf("%d - %s\nGia tien: %.1f\n", this.id, this.tenSP, this.giaSP);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tenSP
     */
    public String getTenSP() {
        return tenSP;
    }

    /**
     * @param tenSP the tenSP to set
     */
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    /**
     * @return the giaSP
     */
    public double getGiaSP() {
        return giaSP;
    }

    /**
     * @param giaSP the giaSP to set
     */
    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }
    
    
    
}
