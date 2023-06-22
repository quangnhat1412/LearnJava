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
public class NhanVienQL extends NhanVien{
    private int luongCB;
    private int phuCapCV;

    public NhanVienQL(String maNV, String tenNV, Ngay ngaySinh, int luongCB, int phuCapCV, double tienThuong) {
        super(maNV, tenNV, ngaySinh, tienThuong);
        this.luongCB = luongCB;
        this.phuCapCV = phuCapCV;
    }

    public int getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(int luongCB) {
        this.luongCB = luongCB;
    }

    public int getPhuCapCV() {
        return phuCapCV;
    }

    public void setPhuCapCV(int phuCapCV) {
        this.phuCapCV = phuCapCV;
    }

    @Override
    public double tinhLuong() {
        return this.luongCB*3 + this.phuCapCV + this.tienThuong;
    }
    
    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); 
        System.out.println("- Luong: " + this.tinhLuong());
    }

    @Override
    public String toString() {
        return super.toString() + " | " + this.luongCB + " | " + this.phuCapCV; //To change body of generated methods, choose Tools | Templates.
        
    }
    
}
