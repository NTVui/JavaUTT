/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.de5;

/**
 *
 * @author soide
 */
public class SinhVienUTT extends SinhVien {
    private String donVi;
    private double luong;
    
    // Phương thức khởi tạo không tham số
    public SinhVienUTT() {
        super();
        this.donVi = "";
        this.luong = 0.0;
    }
    
    // Phương thức khởi tạo có tham số
    public SinhVienUTT(String maSinhVien, String hoTen, int ngaySinh, String gioiTinh, double diemTrungBinh, String donVi, double luong) {
        super(maSinhVien, hoTen, ngaySinh, gioiTinh, diemTrungBinh);
        this.donVi = donVi;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() +  "SinhVienUTT{" + "donVi=" + donVi + ", luong=" + luong + '}';
    }
    
    
    
    // Getter và setter
    public String getDonVi() { return donVi; }
    public void setDonVi(String donVi) { this.donVi = donVi; }
    
    public double getLuong() { return luong; }
    public void setLuong(double luong) { this.luong = luong; }

}
