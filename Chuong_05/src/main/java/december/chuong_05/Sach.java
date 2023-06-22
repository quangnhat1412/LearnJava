/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_05;

/**
 *
 * @author AN515-45
 */
public class Sach {
    private String tenSach;
    private double donGia; 
    private int namXuatBan;
    private TacGia nguoiViet;    

    public Sach(String tenSach, double donGia, int namXuatBan, TacGia nguoiViet) {
        this.tenSach = tenSach;
        this.donGia = donGia;
        this.namXuatBan = namXuatBan;
        this.nguoiViet = nguoiViet;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getNguoiViet() {
        return nguoiViet;
    }

    public void setNguoiViet(TacGia nguoiViet) {
        this.nguoiViet = nguoiViet;
    }
    
    
    public void XuatTenSach(){
        System.out.println("Ten Sach: " + this.tenSach + " - " + this.nguoiViet.getHoTen());
    }
    public double XuatGiaSauGiam(double x){
        double giaGiam = this.donGia * (1 - x/100);
        System.out.println("Gia ban sau khi giam: " + giaGiam);
        return giaGiam;
    }
    public boolean XuatCungNam(Sach scn){
        if(this.namXuatBan == scn.namXuatBan){
            return true;
        }
              
        return false;
        
    }
}
