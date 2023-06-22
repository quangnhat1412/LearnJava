/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap.giangvien;

import december.baitap.ngaythangnam.Ngay;
import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public class GiangVienCH extends GiangVien{
    private double mucLuongTT;
    private double soGioQD;

    public GiangVienCH() {
    }

    
    public GiangVienCH(String hoTen, Ngay ngaySinh, int soGio, double mucLuongTT, double soGioQD) {
        super(hoTen, ngaySinh, soGio);
        this.mucLuongTT = mucLuongTT;
        this.soGioQD = soGioQD;
    }

    public double getMucLuongTT() {
        return mucLuongTT;
    }

    public void setMucLuongTT(double mucLuongTT) {
        this.mucLuongTT = mucLuongTT;
    }

    public double getSoGioQD() {
        return soGioQD;
    }

    public void setSoGioQD(double soGioQD) {
        this.soGioQD = soGioQD;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); //To change body of generated methods, choose Tools | Templates.
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so gio quy dinh: ");
        this.soGioQD = s.nextDouble();
        System.out.print("Nhap muc luong thoa thuan: ");
        this.mucLuongTT = s.nextDouble();
    }

    
    @Override
    public double tinhLuong() {
        //return this.mucLuongTT + (this.soGio - this.soGioQD) * 150000;
        return this.mucLuongTT + Math.max(0,(this.soGio - this.soGioQD) * 150000);
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("- Luong: " + this.tinhLuong());
    }
}
