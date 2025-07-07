/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de5;

/**
 *
 * @author soide
 */
public class SinhVienHTTT extends SinhVien{
    private double hocPhi;
    
    // Phương thức khởi tạo không tham số
    public SinhVienHTTT() {
        super(); // Gọi constructor của class cha
        this.hocPhi = 0.0;
    }
    
    // Phương thức khởi tạo có tham số
    public SinhVienHTTT(String maSinhVien, String hoTen, int ngaySinh, String gioiTinh, double diemTrungBinh, double hocPhi) {
        super(maSinhVien, hoTen, ngaySinh, gioiTinh, diemTrungBinh);
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return super.toString() +  "SinhVienHTTT{" + "hocPhi=" + hocPhi + '}';
    }
    
    
   
    
    // Getter và setter cho học phí
    public double getHocPhi() { return hocPhi; }
    public void setHocPhi(double hocPhi) { this.hocPhi = hocPhi; }
}

