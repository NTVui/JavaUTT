/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sinhvien;

/**
 *
 * @author soide
 */
public class Student extends Person{
    private String maSv, email;
    private double diemTK;

    public Student(String maSv, String email, double diemTK, String hoTen, String diaChi, String gioiTinh, int ngaySinh) {
        super(hoTen, diaChi, gioiTinh, ngaySinh);
        this.maSv = maSv;
        this.email = email;
        this.diemTK = diemTK;
    }
    
    public String getMaSv() { return maSv; }
    public void setMaSv(String maSv) { this.maSv = maSv; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public double getDiemTK() { return diemTK; }
    public void setDiemTK(double diemTK) { this.diemTK = diemTK; }

    
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Ma sinh vien: "+maSv);
        System.out.println("Email: "+email);
        System.out.println("Diem tong ket:"+diemTK);
    }


    
    
    
    
}
