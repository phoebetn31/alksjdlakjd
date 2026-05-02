/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.bth4;

/**
 *
 * @author admin
 */
public abstract class TaiKhoan {
    private static int dem;
    private String soTk;
    private String tenTk;
    protected double soTien;
    
    {
        soTk = String.format("%06d", ++dem);
    }

    public TaiKhoan(String tenTk, double soTien) {
        this.tenTk = tenTk;
        this.soTien = soTien;
    }
    
    public void hienThi(){
        System.out.printf("%s - %s - %.1f VND\n", this.soTk, this.tenTk, this.soTien);
    }
    
    public abstract boolean isDaoHan();
    public abstract double tinhTienLai();

    
    public void nopTien(double st){
        if (this.isDaoHan())
            this.soTien += st;
    }
    
    public void rutTien(double st){
        if (this.isDaoHan() && this.soTien >= st) {
            this.soTien -= st;
        }
    }
    /**
     * @return the soTk
     */
    public String getSoTk() {
        return soTk;
    }

    /**
     * @param soTk the soTk to set
     */
    public void setSoTk(String soTk) {
        this.soTk = soTk;
    }

    /**
     * @return the tenTk
     */
    public String getTenTk() {
        return tenTk;
    }

    /**
     * @param tenTk the tenTk to set
     */
    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    /**
     * @return the soTien
     */
    public double getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
    
}
