/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap.nguoilaodong;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public class NhanVien extends NguoiLaoDong{
    private String chucVu;
    private String loaiNV;

    public NhanVien() {
    }
    
    public NhanVien(String hoTen, LocalDate ngaySinh, int heSoLuong, int luongCS, String chucVu, String loaiNV) {
        super(hoTen, ngaySinh, heSoLuong, luongCS);
        this.chucVu = chucVu;
        this.loaiNV = loaiNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }
    
    @Override
    public double ThuNhap() {
        //tienTangThem();   
        double tienTT = 0;
        if(this.loaiNV.equalsIgnoreCase("A")){
            tienTT = this.tinhLuongCB();
        }
        if(this.loaiNV.equalsIgnoreCase("B")){
            tienTT = this.tinhLuongCB() * 0.8;
        }
        if(this.loaiNV.equalsIgnoreCase("C")){
            tienTT = this.tinhLuongCB() * 0.5;
        }
        
        return this.tinhLuongCB() + tienTT;
    }
    
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("- Thu Nhap: " + this.ThuNhap());
    }
    
    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner s =new Scanner(System.in);
        System.out.print("Chuc Vu: ");
        this.chucVu = s.nextLine();
        System.out.print("Loai NV: ");
        this.loaiNV = s.nextLine();
    }
    
}
