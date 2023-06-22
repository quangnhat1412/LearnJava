/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_05;

import java.util.Objects;

/**
 *
 * @author AN515-45
 */
public class HocSinh {
    private String maHS; 
    private String tenHS;
    private LopHoc lop;
    private double diemToan;
    private double diemVan;
    private Ngay ngaySinh;

    public HocSinh(String maHS, String tenHS, LopHoc lop, double diemToan, double diemVan, Ngay ngaySinh) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.lop = lop;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.ngaySinh = ngaySinh;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public void xuatTenKhoa(){
        System.out.println("Ten Khoa: " + this.lop.getKhoa().getTenKhoa());
    }
    public double diemTrungBinh(){
        double dtb = (this.diemToan * 2 + this.diemVan)/3;
//        String formattedDtb = String.format("%.2f", dtb);
//        double roundedDtb = Double.parseDouble(formattedDtb);
        System.out.printf("Diem trung binh cua %s: %.2f \n", this.tenHS, dtb);
        return dtb;
    }
    public void xepLoai(){
        double dtb = (this.diemToan * 2 + this.diemVan)/3;
        if(dtb >= 9){
            System.out.println("Xep loai xuat sac");
        }
        else if(dtb >= 8){
            System.out.println("Xep loai gioi");
        }
        else if(dtb >= 6.5){
            System.out.println("Xep loai kha");
        }
        else if(dtb >= 5){
            System.out.println("Xep loai trung binh");
        }
        else if(dtb < 5){
            System.out.println("Xep loai yeu");
        }
    }
    
    public boolean sSngaySinhHS(HocSinh hsk){
        return this.ngaySinh.equals(hsk.ngaySinh); 
    }
    
    
}
