/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.bth4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLyTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<>();
    
    public void themTk(TaiKhoan...a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void hienThi(){
        this.ds.forEach(t -> t.hienThi());
    }
    
    public void xemTienLai(){
        this.ds.forEach(t -> System.out.printf("%s: %.1f\n", t.getTenTk(), t.tinhTienLai()));
    }

    /**
     * @return the ds
     */
    public List<TaiKhoan> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }
    
    
}
