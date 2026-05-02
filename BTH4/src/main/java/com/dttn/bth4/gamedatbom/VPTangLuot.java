/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.bth4.gamedatbom;

/**
 *
 * @author admin
 */
public class VPTangLuot extends VatPham{
    public static int demA;
    {
        id = String.format("A%02d", ++demA);
    }

    public VPTangLuot(String ten, int gt) {
        super(ten, gt);
    }
}
