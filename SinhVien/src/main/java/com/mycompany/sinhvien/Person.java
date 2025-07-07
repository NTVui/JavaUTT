/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sinhvien;

/**
 *
 * @author soide
 */
public class Person {
    private String hoTen, diaChi, gioiTinh;
    private int ngaySinh;

    public Person(String hoTen, String diaChi, String gioiTinh, int ngaySinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public void hienThi(){
        System.out.println("Ho ten: "+ hoTen);
        System.out.println("Dia chi: "+ diaChi);
        System.out.println("Gioi tinh: "+gioiTinh);
        System.out.println("Ngay sinh:"+ngaySinh);
    }

}
