/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.bth3;

/**
 *
 * @author admin
 */
public class Ellipse extends Shape{
    private double bKTrucLon;
    private double bKTrucNho;

    public Ellipse(double bKTrucLon, double bKTrucNho) {
        this.bKTrucLon = bKTrucLon;
        this.bKTrucNho = bKTrucNho;
    }

    @Override
    public double tinhDienTich(){
        return Math.PI*this.bKTrucLon*this.bKTrucNho;
    }
    
    public double tinhChuVi(){
        return 2*Math.PI*Math.sqrt((Math.pow(bKTrucLon, 2)+Math.pow(bKTrucNho, 2))/2);
    }

    @Override
    public String toString() {
        return String.format("Hinh Ellipse\nDien tich: %.1f\nChu vi: %.1f\n", this.tinhDienTich(), this.tinhChuVi()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    /**
     * @return the bKTrucLon
     */
    public double getbKTrucLon() {
        return bKTrucLon;
    }

    /**
     * @param bKTrucLon the bKTrucLon to set
     */
    public void setbKTrucLon(double bKTrucLon) {
        this.bKTrucLon = bKTrucLon;
    }

    /**
     * @return the bKTrucNho
     */
    public double getbKTrucNho() {
        return bKTrucNho;
    }

    /**
     * @param bKTrucNho the bKTrucNho to set
     */
    public void setbKTrucNho(double bKTrucNho) {
        this.bKTrucNho = bKTrucNho;
    }
    
    
}
