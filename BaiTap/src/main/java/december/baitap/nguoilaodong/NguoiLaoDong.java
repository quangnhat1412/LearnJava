/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap.nguoilaodong;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public abstract class NguoiLaoDong implements Comparable<NguoiLaoDong>{
    protected String hoTen;
    protected LocalDate ngaySinh;
    protected int  heSoLuong;
    protected int luongCS;

    public NguoiLaoDong() {
    }
    
    public NguoiLaoDong(String hoTen, LocalDate ngaySinh, int heSoLuong, int luongCS) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.heSoLuong = heSoLuong;
        this.luongCS = luongCS;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getLuongCS() {
        return luongCS;
    }

    public void setLuongCS(int luongCS) {
        this.luongCS = luongCS;
    }
    
    public String getTen(){
        String t_xkc = this.hoTen.trim();
        String kc = " ";
        int vtc_kc = t_xkc.lastIndexOf(kc);
        String ten = t_xkc.substring(vtc_kc + 1);
        return ten;
    }
    Scanner s = new Scanner(System.in);
    
    public void nhapThongTin(){
        System.out.print("Ho Ten: ");
        this.hoTen=s.nextLine();
        System.out.print("Ngay sinh (yyyy-mm-dd): ");
        String ns = s.nextLine();
        this.ngaySinh= LocalDate.parse(ns);
        System.out.print("He So Luong: ");
        this.heSoLuong = s.nextInt();
        System.out.print("Luong co so: ");
        this.luongCS = s.nextInt();
    }
    
    public void xuatThongTin(){
        System.out.println("- Ho ten: " + this.hoTen + "\n- Ngay Sinh: " + this.ngaySinh.getDayOfMonth()+ "/" + this.ngaySinh.getMonthValue()+ "/"+this.ngaySinh.getYear());
    }
    public double tinhLuongCB(){
        return this.heSoLuong*this.luongCS;
    }
    public abstract double ThuNhap();

    @Override
    public int compareTo(NguoiLaoDong o){
        return Integer.compare(this.heSoLuong, o.heSoLuong); 
    }
    
    public static Comparator<NguoiLaoDong> compareByten(){
        return Comparator.comparing(NguoiLaoDong::getTen);
    }

    @Override
    public String toString() {
        return this.hoTen + " | " + this.ngaySinh + " | " + this.heSoLuong + " | " + this.luongCS;
    }
        
//    public void tinhToanNgayThang(){
//        LocalDate ntn1= this.ngaySinh;
//        
//        //1. Lay ngay thang nam hien tai
//        LocalDate ntnhh = LocalDate.now();
//        System.out.println("Ngay thang nam hien hanh: " + ntnhh);
//        
//        // 2. Khoi tao mot ngay thang nam cu the
//        LocalDate ntn3= LocalDate.of(2018,11,25);
//        LocalDate ntn4= LocalDate.of(2013,4,3);
//        //3. Lay so ngay trong thangs 
//        System.out.println("Ngay trong thang: "+ ntn3.getDayOfMonth());
//        //4. Lay thang 
//        System.out.println("Thang : "+ ntn3.getMonthValue());
//        //5. Lay nam
//        System.out.println("Nam: "+ ntn3.getYear());
//        //7. Khoang cach giua 2 nam
//        long sonam= ntn4.until(ntn3,ChronoUnit.YEARS);
//        System.out.println("So nam giua 2 doi tuong: " +sonam);
//        //8. Khoang cach thang giua 2 doi tuong ngay thang nam
//        long sothang= ntn4.until(ntn3,ChronoUnit.MONTHS);
//        System.out.println("So thang giua 2 doi tuong: " +sothang);
//        //9. Khoang cach giua ngay giua 2 doi tuong ngay thang nam
//        long songay= ntn4.until(ntn3,ChronoUnit.DAYS);
//        System.out.println("So ngay giua 2 doi tuong: " +songay);
//        
//    }

        
}
