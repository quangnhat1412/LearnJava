/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.javacb_bt.tailieu;

/**
 *
 * @author AN515-45
 */
public class TaiLieu {
    protected String maTaiLieu;
    protected String tenNXb;
    protected int soBanPhatHanh;

    public TaiLieu() {
    }
    
    public TaiLieu(String maTaiLieu, String tenNXb, int soPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXb = tenNXb;
        this.soBanPhatHanh = soPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNXb() {
        return tenNXb;
    }

    public void setTenNXb(String tenNXb) {
        this.tenNXb = tenNXb;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void inThongTin(){
        System.out.print("- Ma tai lieu: "+this.maTaiLieu+"; ten nha xuat ban: "+this.tenNXb + ": so ban phat hanh: " + this.soBanPhatHanh);
    }
    
    
}
