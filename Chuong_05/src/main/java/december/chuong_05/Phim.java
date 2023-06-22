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
public class Phim {
    private String tenPhim; 
    private NhaSX nhaSXuat;
    private double giaVe;
    private Ngay ngayChieu;

    public Phim(String tenPhim, NhaSX nhaSXuat, double giaVe, Ngay ngayChieu) {
        this.tenPhim = tenPhim;
        this.nhaSXuat = nhaSXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public NhaSX getNhaSXuat() {
        return nhaSXuat;
    }

    public void setNhaSXuat(NhaSX nhaSXuat) {
        this.nhaSXuat = nhaSXuat;
    }
    
    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public Ngay getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Phim other = (Phim) obj;
        if (Double.doubleToLongBits(this.giaVe) != Double.doubleToLongBits(other.giaVe)) {
            return false;
        }
        if (!Objects.equals(this.tenPhim, other.tenPhim)) {
            return false;
        }
        if (!Objects.equals(this.nhaSXuat, other.nhaSXuat)) {
            return false;
        }
        if (!Objects.equals(this.ngayChieu, other.ngayChieu)) {
            return false;
        }
        return true;
    }
    
    
    
    public void XuatTenPhim(){
        System.out.println("Ten Phim: "+ this.tenPhim);
    }
    
    public double GiaBanSauKhuyenMai(double x){
        double gvsg = this.giaVe * (1-x/100);
        System.out.println("Gia ve sau khi giam gia cua phim la: " + gvsg);
        return gvsg;
    }
    
    public void SSgiave(Phim p){
        if(this.giaVe < p.giaVe){
            System.out.println("Gia ve phim: " + this.tenPhim + " re hon phim: " + p.tenPhim);
        }
        if(this.giaVe == p.giaVe){
            System.out.println("Gia ve 2 phim bang nhau");
        }
        if(this.giaVe > p.giaVe){
            System.out.println("Gia ve phim: " + this.tenPhim + " mac hon phim: " + p.tenPhim);
        }
    }
    
    public boolean CheckNgayChieu(Phim ssn){
        return this.ngayChieu.equals(ssn.ngayChieu);
    }
}
