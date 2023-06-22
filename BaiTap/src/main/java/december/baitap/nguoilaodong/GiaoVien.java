/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.baitap.nguoilaodong;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author AN515-45
 */
public class GiaoVien extends NguoiLaoDong{
    private LocalDate ngayVaoLam;
    private int soGioVuot;
    private int tien1hVuot;

    public GiaoVien() {
    }
    public GiaoVien(String hoTen, LocalDate ngaySinh, int heSoLuong, int luongCS, LocalDate ngayVaoLam, int soGioVuot, int tien1hVuot) {
        super(hoTen, ngaySinh, heSoLuong, luongCS);
        this.ngayVaoLam = ngayVaoLam;
        this.soGioVuot = soGioVuot;
        this.tien1hVuot = tien1hVuot;
    }

    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public int getSoGioVuot() {
        return soGioVuot;
    }

    public void setSoGioVuot(int soGioVuot) {
        this.soGioVuot = soGioVuot;
    }

    public int getTien1hVuot() {
        return tien1hVuot;
    }

    public void setTien1hVuot(int tien1hVuot) {
        this.tien1hVuot = tien1hVuot;
    }

    @Override
    public double ThuNhap() {
        LocalDate year = LocalDate.now();
        //int thamnien=year.getYear() - this.ngayVaoLam.getYear();
        long sonam= this.ngayVaoLam.until(year,ChronoUnit.YEARS);
        return this.tinhLuongCB() * ( 1 + sonam*0.01) + this.soGioVuot * this.tien1hVuot ;

    }
    
    @Override
    public void xuatThongTin() {
        super.xuatThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("- Thu Nhap: " + this.ThuNhap());
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin(); //To change body of generated methods, choose Tools | Templates.
        Scanner s =new Scanner(System.in);
        System.out.print("Ngay Vao Lam: ");
        int d= s.nextInt();
        System.out.print("/");
        int m=s.nextInt();
        System.out.print("/");
        int y=s.nextInt();
        System.out.println("");
        this.ngayVaoLam=LocalDate.of(d, m, y);
        System.out.print("So Gio vuot");
        this.soGioVuot=s.nextInt();
        System.out.print("Tien 1 Gio vuot");
        this.tien1hVuot=s.nextInt();
    }
    
    
    
}
