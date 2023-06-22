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
public class HocSinh{
    private String maHS; 
    private String tenHS;
    private int tuoi; 

    public HocSinh(String maHS, String tenHS, int tuoi) {
        this.maHS = maHS;
        this.tenHS = tenHS;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public String getTen(){
        String ten_kkc = this.tenHS.trim();
        String kc = " ";
        int vt = ten_kkc.lastIndexOf(kc);
        return ten_kkc.substring(vt + 1);
    }

    @Override
    public String toString() {
        return "- " + this.maHS + " - " + this.tenHS + " - " + this.tuoi;
    }
    
    public static Comparator<HocSinh> comparaByten(){
        return Comparator.comparing(HocSinh::getTen);
    }
    
    
}
