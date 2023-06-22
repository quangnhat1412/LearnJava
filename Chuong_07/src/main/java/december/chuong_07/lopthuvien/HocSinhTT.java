/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package december.chuong_07.lopthuvien;

import java.util.Comparator;



/**
 *
 * @author AN515-45
 */

// Khai báo class trừu tượng (abstract)
public abstract class HocSinhTT implements Comparable<HocSinhTT>{
    protected String maHS;
    protected String tenHS;
    protected String phai;
    protected int tuoi;

    public HocSinhTT(String maHS, String tenHS, String phai, int tuoi) {
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.phai = phai;
        this.tuoi = tuoi;
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

    public String getPhai() {
        return phai;
    }

    public void setPhai(String phai) {
        this.phai = phai;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public String getTen(){
        String ten_kkc = this.tenHS.trim();
        String kc = " ";
        int vtc = ten_kkc.lastIndexOf(kc);
        String ten = ten_kkc.substring(vtc + 1);
        return ten;
    }
    
    public void inThongTin(){
        System.out.println("- Ma: " + this.maHS +"\n- TenHS: " + this.tenHS + "\n- Phai: " +this.phai );
        
    }
    // Khai báo tính trung bình là phương thức trừu tượng
    public abstract double tinhTB();
    public abstract String xepLoai();

    @Override
    public String toString() {
        return "- Ma HS: " + this.maHS + " - Ho ten: " + this.tenHS + " - Phai: " + this.phai + " - tuoi: "+ this.tuoi;
    }

    @Override
    public int compareTo(HocSinhTT hs){
        return this.tenHS.compareTo(hs.tenHS);
    }
    
    public static Comparator<HocSinhTT> compareByten(){
        return Comparator.comparing(HocSinhTT::getTen);
    }
    public static Comparator<HocSinhTT> compareBytuoi(){
        return Comparator.comparing(HocSinhTT::getTuoi);
    }
}
