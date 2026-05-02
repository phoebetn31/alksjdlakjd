/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.bth4.gamedatbom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class NhanVat {
    private static int dem = 0;
    private int id;
    private String tenNv;
    private int luongMau;
    private int luotChoi;
    private List<VatPham> dsVP = new ArrayList<>();
    
    {
        setDem(getDem() + 1);
        this.setId(getDem());
        
    }

    public NhanVat(String tenNv, int luongMau, int luotChoi) {
        this.tenNv = tenNv;
        this.luongMau = luongMau;
        this.luotChoi = luotChoi;
    }
    
    public NhanVat(String tenNv) {
        this.tenNv = tenNv;
        this.luongMau = 10;
        this.luotChoi = 1;
    }
    
    public void hienThi(){
        System.out.printf("%d - %s - %d - %d\n", this.getId(), this.getTenNv(), this.luongMau, this.luotChoi);
        System.out.println("Danh sach vat pham:");
        this.getDsVP().forEach(v1 -> v1.hienThi());
    }
    
    public void themVatPham(VatPham...a){
        this.getDsVP().addAll(Arrays.asList(a));
    }
    
    public void suDungVp(){
        
    }
    
    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
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
     * @return the tenNv
     */
    public String getTenNv() {
        return tenNv;
    }

    /**
     * @param tenNv the tenNv to set
     */
    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    /**
     * @return the ds
     */
    public List<VatPham> getDs() {
        return getDsVP();
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<VatPham> ds) {
        this.setDsVP(ds);
    }

    /**
     * @return the luongMau
     */
    public int getLuongMau() {
        return luongMau;
    }

    /**
     * @param luongMau the luongMau to set
     */
    public void setLuongMau(int luongMau) {
        this.luongMau = luongMau;
    }

    /**
     * @return the luotChoi
     */
    public int getLuotChoi() {
        return luotChoi;
    }

    /**
     * @param luotChoi the luotChoi to set
     */
    public void setLuotChoi(int luotChoi) {
        this.luotChoi = luotChoi;
    }

    /**
     * @return the dsVP
     */
    public List<VatPham> getDsVP() {
        return dsVP;
    }

    /**
     * @param dsVP the dsVP to set
     */
    public void setDsVP(List<VatPham> dsVP) {
        this.dsVP = dsVP;
    }
    
}
