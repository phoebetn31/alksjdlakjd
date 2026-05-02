/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.dttn.bth4;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public enum KyHan {
    MOT_TUAN(7, 0.5) {
        @Override
        public LocalDate tinhDaoHan() {
            return LocalDate.now().plusDays(this.khoangThoiGian);
        }

        @Override
        public double tinhLai(double st) {
            return (st * this.laiSuat)/(12*100*4);
        }
    },
    MOT_THANG(1, 4.5) {
        @Override
        public LocalDate tinhDaoHan() {
            return LocalDate.now().plusMonths(this.khoangThoiGian);
        }

        @Override
        public double tinhLai(double st) {
            return (st * this.laiSuat)/(12*100);
        }
    },
    MOT_NAM(1, 6.8) {
        @Override
        public LocalDate tinhDaoHan() {
            return LocalDate.now().plusYears(this.khoangThoiGian);
        }

        @Override
        public double tinhLai(double st) {
            return (st * this.laiSuat)/(100);
        }
    };
    
    protected int khoangThoiGian;
    protected double laiSuat;

    private KyHan(int khoangThoiGian, double ls) {
        this.khoangThoiGian = khoangThoiGian;
        this.laiSuat = ls;
    }
    
    public abstract LocalDate tinhDaoHan();
    public abstract double tinhLai(double st);
}
