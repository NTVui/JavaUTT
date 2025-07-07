/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.de3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soide
 */
public class De3 {

    public static ArrayList<NhanVien> docFile(String tenFile) throws FileNotFoundException{
        ArrayList<NhanVien> ds = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(tenFile));
        String line;
        try {
            while((line = br.readLine()) != null){
                String[] part = line.split("\\$");
                if(part.length == 8){
                    String hoTen = part[0];
                    String ngaySinh = part[1];
                    String diaChi = part[2];
                    String gioiTinh = part[3];
                    String pb = part[4];
                    double heSoLuong = Double.parseDouble(part[5]);
                    int thamNien = Integer.parseInt(part[6]);
                    double lcb = Double.parseDouble(part[7]);
                    
                    NhanVien nv = new NhanVien(pb, heSoLuong, lcb, thamNien, hoTen, diaChi, gioiTinh, ngaySinh);
                    ds.add(nv);
                }
            }
            br.close();
            System.out.println("Doc file thanh cong!");
        } catch (IOException ex) {
            System.out.println("Loi khi doc file: " + ex.getMessage());
        }
        return ds;
    }
    
    public static void Menu(){
        System.out.println("--------Menu-----------");
        System.out.println("1. Doc du lieu file va hien thi tren console");
        System.out.println("2. Thoat");
    }
    
    public static void hienThiDS(ArrayList<NhanVien> ds){
        System.out.println("-----Danh sach nhan vien------");
        System.out.println("Tong so nhan vien: " + ds.size());
        System.out.println("---------------------------------");
        
        for(int i = 0; i < ds.size(); i++){
            System.out.println("Nhan vien thu " + (i+1) + ":");
            ds.get(i).hienThi();
            System.out.println("-----------------------------");
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String tenFile = "E:/nhanvien.dat";
        while(true){
            Menu();
            int chon = sc.nextInt();
            switch(chon){
                case 1:
                    ArrayList<NhanVien> danhsach = docFile(tenFile);
                    if(danhsach.size()>0){
                        hienThiDS(danhsach);
                    }else{
                        System.out.println("Khong co du lieu!");
                    }
                    break;
                  
                case 2:
                    System.out.println("Thoat chuong trinh!");
                    sc.close();
                    return;
             
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
    }
}
