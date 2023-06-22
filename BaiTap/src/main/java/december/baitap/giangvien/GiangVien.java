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
public abstract class GiangVien implements Comparable<GiangVien>{
    protected String hoTen;
    protected Ngay ngaySinh;
    protected int soGio;

    public GiangVien() {
    }

    public GiangVien(String hoTen, Ngay ngaySinh, int soGio) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soGio = soGio;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoGio() {
        return soGio;
    }

    public void setSoGio(int soGio) {
        this.soGio = soGio;
    }
    
    public void nhapThongTin(){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = s.nextLine();
        System.out.print("Nhap ngay sinh: ");
        int ngay = s.nextInt();
        System.out.print("Nhap thang sinh: ");
        int thang = s.nextInt();
        System.out.print("Nhap nam sinh: ");
        int nam = s.nextInt();
        this.ngaySinh = new Ngay(ngay,thang,nam);
        System.out.print("Nhap so gio day trong thang: ");
        this.soGio = s.nextInt();
    }
    
    public void xuatThongTin(){
        System.out.println("*** Thong Tin Giang Vien:\n- Ho ten: " + this.hoTen + "\n- Ngay Sinh: " + this.getNgaySinh().getDay() + "/" + this.getNgaySinh().getMonth() + "/" + this.getNgaySinh().getYear());
    }

    @Override
    public int compareTo(GiangVien gv){
        return Integer.compare(this.soGio, gv.soGio);
    }

    @Override
    public String toString() {
        return this.hoTen + " | " + this.ngaySinh + " | " + this.soGio;
    }
    
    
    public abstract double tinhLuong();
}
