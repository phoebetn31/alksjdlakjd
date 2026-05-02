/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.bth4.gamedatbom;

/**
 *
 * @author admin
 */
public abstract class VatPham {
    protected String id;
    private String tenVp;
    private int giaTri;
    
    public VatPham(String ten, int gt){
        this.tenVp = ten;
        this.giaTri = gt;
    }
    
    public void hienThi(){
        System.out.printf("%s - %s- %d\n", this.id, this.tenVp, this.giaTri);
    }
    
    /**
     * @return the tenVp
     */
    public String getTenVp() {
        return tenVp;
    }

    /**
     * @param tenVp the tenVp to set
     */
    public void setTenVp(String tenVp) {
        this.tenVp = tenVp;
    }

    /**
     * @return the giaTri
     */
    public int getGiaTri() {
        return giaTri;
    }

    /**
     * @param giaTri the giaTri to set
     */
    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }
}
