/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dttn.bth4;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class TkKyHan extends TaiKhoan{
    private KyHan kyHan;
    private LocalDate ngayDaoHan;

    public TkKyHan(String tenTk, double soTien, KyHan kyHan) {
        super(tenTk, soTien);
        this.kyHan = kyHan;
        this.ngayDaoHan = kyHan.tinhDaoHan();
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        System.out.printf("Ky han: %s\nNgay dao han: %s\n",
                this.kyHan, this.ngayDaoHan.format(CauHinh.FORMATTER));
    }

    @Override
    public boolean isDaoHan() {
        return this.ngayDaoHan.compareTo(LocalDate.now()) == 0;
    }

    @Override
    public double tinhTienLai() {
        return this.kyHan.tinhLai(this.soTien);
    }
    /**
     * @return the kyHan
     */
    public KyHan getKyHan() {
        return kyHan;
    }

    /**
     * @param kyHan the kyHan to set
     */
    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    /**
     * @return the ngayDaoHan
     */
    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(LocalDate ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }
    
    
}
