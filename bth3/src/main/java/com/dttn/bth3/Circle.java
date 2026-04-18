/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.bth3;

/**
 *
 * @author admin
 */
public class Circle extends Ellipse{
    public Circle(double bK){
        super(bK, bK);
    }
    
    @Override
    public String toString() {
        return String.format("Hinh Ellipse\nDien tich: %.1f\nChu vi: %.1f\n", this.tinhDienTich(), this.tinhChuVi()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
