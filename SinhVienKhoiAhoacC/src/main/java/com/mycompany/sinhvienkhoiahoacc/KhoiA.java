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
public class KhoiA extends ThiSinh{
    private double diemToan, diemLy, diemHoa;

    public KhoiA() {}

    public KhoiA(String hoTen, String ngaySinh, String diaChi,
                        double diemToan, double diemLy, double diemHoa) {
        super(hoTen, ngaySinh, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm Toán: ");
        diemToan = sc.nextDouble();
        System.out.print("Nhập điểm Lý: ");
        diemLy = sc.nextDouble();
        System.out.print("Nhập điểm Hóa: ");
        diemHoa = sc.nextDouble();
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Khối A - Toán: " + diemToan + ", Lý: " + diemLy + ", Hóa: " + diemHoa);
        System.out.println("Tổng điểm: " + tinhTongDiem());
    }

    public double tinhTongDiem() {
        return diemToan + diemLy + diemHoa;
    }
}
