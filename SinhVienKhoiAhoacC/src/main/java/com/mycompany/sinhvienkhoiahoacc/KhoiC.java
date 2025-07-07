/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sinhvienkhoiahoacc;

import java.util.Scanner;

/**
 *
 * @author soide
 */
public class KhoiC extends ThiSinh {
    private double diemVan, diemSu, diemDia;

    public KhoiC() {}

    public KhoiC(String hoTen, String ngaySinh, String diaChi,
                        double diemVan, double diemSu, double diemDia) {
        super(hoTen, ngaySinh, diaChi);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm Văn: ");
        diemVan = sc.nextDouble();
        System.out.print("Nhập điểm Sử: ");
        diemSu = sc.nextDouble();
        System.out.print("Nhập điểm Địa: ");
        diemDia = sc.nextDouble();
    
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemSu() {
        return diemSu;
    }

    public void setDiemSu(double diemSu) {
        this.diemSu = diemSu;
    }

    public double getDiemDia() {
        return diemDia;
    }

    public void setDiemDia(double diemDia) {
        this.diemDia = diemDia;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Khối C - Văn: " + diemVan + ", Sử: " + diemSu + ", Địa: " + diemDia);
        System.out.println("Tổng điểm: " + tinhTongDiem());
    }

    public double tinhTongDiem() {
        return diemVan + diemSu + diemDia;
    }
}
