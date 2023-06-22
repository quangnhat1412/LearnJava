/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap;

import december.baitap.ngaythangnam.Ngay;
import java.util.Comparator;

/**
 *
 * @author AN515-45
 */
public abstract class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected Ngay ngaySinh;
    protected double tienThuong;

    public NhanVien(String maNV, String tenNV, Ngay ngaySinh, double tienThuong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.tienThuong = tienThuong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }
    
    public String getTen(){
        String t_xkc = this.tenNV.trim();
        String kc = " ";
        int vtc = t_xkc.lastIndexOf(kc);
        String ten = t_xkc.substring(vtc + 1);
        return ten;
    }
    
    public void xuatThongTin(){
        System.out.println("Thong tin:");
        System.out.println("- Ma: " + this.maNV + "Ten: "+ this.tenNV + "- ngay sinh: " + this.ngaySinh);
    }
    
    // So sanh các đói tượng nhân viên theo tên của chúng
    public static Comparator<NhanVien> compareByten(){ 
        return Comparator.comparing(NhanVien::getTen);
    }
    
    @Override
    public String toString() {
        return " | " + this.maNV + " | " + this.tenNV + " | " + this.tienThuong;
    }
    
    public abstract double tinhLuong();
}
