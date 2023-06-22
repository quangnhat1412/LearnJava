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
public class GiangVienTT extends GiangVien{
    private double tienLuongTT; // luong theo gio thoa thuan

    public GiangVienTT() {
    }

    
    public GiangVienTT(String hoTen, Ngay ngaySinh, int soGio, double tienLuongTT) {
        super(hoTen, ngaySinh, soGio);
        this.tienLuongTT = tienLuongTT;
    }

    public double getTienLuongTT() {
        return tienLuongTT;
    }

    public void setTienLuongTT(double tienLuongTT) {
        this.tienLuongTT = tienLuongTT;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); //To change body of generated methods, choose Tools | Templates.
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap tien luong thoa thuan: ");
        this.tienLuongTT = s.nextDouble();
    }
    
    
    @Override
    public double tinhLuong() {
        return this.soGio * this.tienLuongTT;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("- Luong: " + this.tinhLuong());
    }
       
}

