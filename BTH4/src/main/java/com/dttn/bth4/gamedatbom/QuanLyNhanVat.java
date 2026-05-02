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
public class QuanLyNhanVat {
    private List<NhanVat> ds = new ArrayList<>();
    
    public void themNv(NhanVat...a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void hienThi(){
        this.ds.forEach(t -> t.hienThi());
    }

    /**
     * @return the ds
     */
    public List<NhanVat> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NhanVat> ds) {
        this.ds = ds;
    }
    
    
}
