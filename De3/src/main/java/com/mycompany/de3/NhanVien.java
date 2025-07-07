/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de3;

import java.text.DecimalFormat;

/**
 *
 * @author soide
 */
public class NhanVien extends Person {
    private String pb;
    private double hesoLuong,luongcb;
    private int thamNien;

    public NhanVien() {
        super();
    }

    public NhanVien(String pb, double hesoLuong, double luongcb, int thamNien, String hoTen, String diaChi, String gioiTinh, String ngaySinh) {
        super(hoTen, diaChi, gioiTinh, ngaySinh);
        this.pb = pb;
        this.hesoLuong = hesoLuong;
        this.luongcb = luongcb;
        this.thamNien = thamNien;
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public double getHesoLuong() {
        return hesoLuong;
    }

    public void setHesoLuong(double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }

    public double getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(double luongcb) {
        this.luongcb = luongcb;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }
    
    
    public String luong_thuc_linh(){
        DecimalFormat df = new DecimalFormat("#,###");
        double ltl = luongcb * hesoLuong * (1 + (thamNien/100));
        String a = df.format(ltl);
        return a;
    }
    
    @Override
    public void hienThi(){
        
        super.hienThi();
        System.out.println("Phong ban: " + pb);
        System.out.println("He so luong: " + hesoLuong);
        System.out.println("Tham nien: " + thamNien + " nam");
        System.out.println("Luong co ban: " + luongcb);
        System.out.println("Luong thuc linh: " + luong_thuc_linh() + "VND");
        System.out.println("---------------------------");
    }
    
}
