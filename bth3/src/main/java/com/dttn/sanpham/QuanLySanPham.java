/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.sanpham;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QuanLySanPham {
    private List<SanPham> ds = new ArrayList<>();

    public void themSP(SanPham... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void hienThi(){
        this.ds.forEach(s -> s.hienThi());
    }
    
    public void sapXep(){
        ds.sort((s1, s2) -> -Double.compare(s1.getGiaSP(), s2.getGiaSP()));
    }
    
    public void sapXep2(){
        this.ds.sort((s1, s2) -> {
            if (s1.getTenSP().equals(s2.getTenSP())) {
                return -Double.compare(s1.getGiaSP(), s2.getGiaSP());
            }
            return s1.getTenSP().compareTo(s2.getTenSP());
        });
    }
    
    public void xoaSP(int id){
        this.ds.removeIf(s -> s.getId() == id);
    }
    
    public void xoaSP(String ten){
        this.ds.removeIf(s -> s.getTenSP().equals(ten));
    }
    
    public SanPham timKiem(int id){
        return this.ds.stream().filter(s -> s.getId() == id).findFirst().get();
    }
    
    public List<SanPham> timKiem(String str){
        try {
            Class c = Class.forName(str);
            return this.ds.stream().filter(s -> c.isInstance(s)).collect(Collectors.toList());
        } catch (ClassNotFoundException ex){
            return this.ds.stream().filter(s -> s.getTenSP().contains(str)).collect(Collectors.toList());
        }
    }
    
    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
    
}
