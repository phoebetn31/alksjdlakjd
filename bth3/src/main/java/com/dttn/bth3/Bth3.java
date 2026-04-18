/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.dttn.bth3;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class Bth3 {

    public static void main(String[] args) {
        Ellipse e1 = new Ellipse(40, 23);
        Ellipse e2 = new Circle(30);
        TamGiac t1 = new TamGiac(5, 6, 7);
        TamGiac t2 = new TamGiacCan(4, 6);
        TamGiac t3 = new TamGiacDeu(5);
        
        Shape[] a = {e1, e2, t1, t2, t3};
        
        
        Arrays.sort(a, (h1, h2) ->
            Double.compare(h1.tinhDienTich(), h2.tinhDienTich()));
        
        for(var h : a){
            System.out.println(h);
        }
    }
}
