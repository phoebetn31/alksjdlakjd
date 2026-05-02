/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.bth4.gamedatbom;

/**
 *
 * @author admin
 */
public class VPTangMau extends VatPham{
    public static int demB;
    {
        id = String.format("B%02d", ++demB);
    }

    public VPTangMau(String ten, int gt) {
        super(ten, gt);
    }
    
}
