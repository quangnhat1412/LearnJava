/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap;

import december.baitap.ngaythangnam.Ngay;

/**
 *
 * @author AN515-45
 */
public class NhanVienNC extends NhanVien{
    private int luongNgay;
    private int soNgayLV;

    public NhanVienNC(String maNV, String tenNV, Ngay ngaySinh, int luongNgay, int soNgayLV, double tienThuong) {
        super(maNV, tenNV, ngaySinh, tienThuong);
        this.luongNgay = luongNgay;
        this.soNgayLV = soNgayLV;
    }

    public int getLuongNgay() {
        return luongNgay;
    }

    public void setLuongNgay(int luongNgay) {
        this.luongNgay = luongNgay;
    }

    public int getSoNgayLV() {
        return soNgayLV;
    }

    public void setSoNgayLV(int soNgayLV) {
        this.soNgayLV = soNgayLV;
    }
    
    @Override
    public double tinhLuong() {
        return this.luongNgay * this.soNgayLV + this.tienThuong;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.luongNgay + " | " + this.soNgayLV; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("- Luong: " + this.tinhLuong());
    }
    
    
    
}
