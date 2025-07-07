/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sinhvienkhoiahoacc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author soide
 */
public class Main {
    ArrayList<ThiSinh> ts = new ArrayList<>();

    public void themThiSinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập khối (A/C): ");
        String khoi = sc.nextLine().toUpperCase();

        if (khoi.equals("A")) {
            KhoiA a = new KhoiA();
            a.nhap();
            ts.add(a);
        } else if (khoi.equals("C")) {
            KhoiC c = new KhoiC();
            c.nhap();
            ts.add(c);
        } else {
            System.out.println(" Khối không hợp lệ.");
        }
    }

    public void hienThiDanhSach() {
        if (ts.isEmpty()) {
            System.out.println(" Danh sách rỗng.");
            return;
        }

        for (ThiSinh sv : ts) {
            sv.inThongTin();
            System.out.println("-------------------------");
        }
        
    }
    public void diemtt(){
        System.out.println("Các thí sinh có tổng điểm > 20:");
        boolean found = false;
        for (ThiSinh sv : ts) {
            double tongDiem = 0;
            if (sv instanceof KhoiA) {
                tongDiem = ((KhoiA) sv).tinhTongDiem();
            } else if (sv instanceof KhoiC) {
                tongDiem = ((KhoiC) sv).tinhTongDiem();
            }
            if (tongDiem > 20) {
                sv.inThongTin();
                System.out.println("-------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có thí sinh nào có tổng điểm > 20.");
        }
    }


    public void luuThongTin() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("E:\\thisinh.dat", true); 
        PrintWriter pr = new PrintWriter(fos);

        for (ThiSinh sv : ts) {
            pr.println("----- Thông tin thí sinh -----");
            pr.println("Họ tên: " + sv.hoTen);
            pr.println("Địa chỉ: " + sv.diaChi);
            pr.println("Ngày sinh: " + sv.ngaySinh);

            if (sv instanceof KhoiA) {
                KhoiA a = (KhoiA) sv;
                pr.println("Khối: A");
                pr.println("Toán: " + a.getDiemToan() + ", Lý: " + a.getDiemLy() + ", Hóa: " + a.getDiemHoa());
                pr.println("Tổng điểm: " + a.tinhTongDiem());
            } else if (sv instanceof KhoiC) {
                KhoiC c = (KhoiC) sv;
                pr.println("Khối: C");
                pr.println("Văn: " + c.getDiemVan() + ", Sử: " + c.getDiemSu() + ", Địa: " + c.getDiemDia());
                pr.println("Tổng điểm: " + c.tinhTongDiem());
            }

            pr.println("------------------------------");
        }

        pr.close();
        System.out.println("Đã lưu vào file E:\\thisinh.dat");
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Main app = new Main();
        int choice;

        do {
            System.out.println("\n=== MENU QUẢN LÝ THÍ SINH ===");
            System.out.println("1. Thêm thí sinh mới");
            System.out.println("2. Hiển thị danh sách thí sinh");
            System.out.println("3. Lưu vào file");
            System.out.println("4. Thoát chương trình");
            System.out.println("5. Hien thi thi sinh trung tuyen > 20: ");
            System.out.print(" Nhập lựa chọn: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Nhập số nguyên hợp lệ!");
                choice = 0;
                continue;
            }

            switch (choice) {
                case 1:
                    app.themThiSinh();
                    break;
                case 2:
                    app.hienThiDanhSach();
                    break;
                case 3:
                    app.luuThongTin();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                    case 5:
                    app.diemtt();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 4);
        sc.close();
    }
}
