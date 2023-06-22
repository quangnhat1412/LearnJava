/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_04;

import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public class HocSinh {
    // Bien thanh phan (field - truong)
    String hoten;
    double diemvan, diemtoan;
    
    // Ham thanh phan (methob - phuong thuc)
    
    public void Nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Hay nhap ho ten: ");
        this.hoten = s.nextLine();
        System.out.print("Hay nhap diem toan: ");
        this.diemtoan = s.nextDouble();
        System.out.print("Hay nhap diem van: ");
        this.diemvan = s.nextDouble();
    }
    private double DiemTB(){
        return (this.diemtoan + this.diemvan) / 2;
    }
    
    private String XepLoai(){
        String kq = "";
        double dtb = DiemTB();
        if(dtb >= 9){
            kq = "Xuat Sac";
        }
        else if (dtb >= 8){
            kq = "Gioi";
        }
        else if (dtb >= 7){
            kq = "kha";
        }
        else if (dtb >= 5){
            kq = "Trung binh";
        }
        else if (dtb < 5) {
            kq = "Yeu";
        }
        return kq;
    }
    public void Xuat(){
        System.out.println("Thong tin hoc sinh: ");
        System.out.printf("- Ten HS: %s\n- Diem Van: %.2f\n- Diem Toan: %.2f\n- Diem TB: %.2f\n- Xep Loai: %s",this.hoten,this.diemvan,this.diemtoan,this.DiemTB(),this.XepLoai());
    }
}
