/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.luyentap_docghitaptin.lan2;

import java.util.Comparator;

/**
 *
 * @author AN515-45
 */
public class NhanVien implements Comparable<NhanVien>{
    private String maNV; 
    private String tenNV;
    private int heSL;

    public NhanVien(String maNV, String tenNV, int heSL) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.heSL = heSL;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getHeSL() {
        return heSL;
    }

    public void setHeSL(int heSL) {
        this.heSL = heSL;
    }
    
    public String getTen(){
        String ten_xkc = this.tenNV.trim();
        String kc = " ";
        int vt = ten_xkc.lastIndexOf(kc);
        return ten_xkc.substring(vt + 1);
    }

    public static Comparator<NhanVien> compareByten(){
        return Comparator.comparing(NhanVien::getTen);
    }
        
    @Override
    public String toString() {
        return "- " + this.maNV + " - " + this.tenNV + " - " + this.heSL;
    }

    @Override
    public int compareTo(NhanVien o) {
        return Integer.compare(this.heSL, o.heSL); // so sanh he so luong 
        //return this.tenNV.compareTo(o.tenNV); // so sanh theo ten
    }
    
    
    
}
